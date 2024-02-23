package net.deali.designsystem.component

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.setViewTreeLifecycleOwner
import androidx.savedstate.SavedStateRegistryOwner
import androidx.savedstate.setViewTreeSavedStateRegistryOwner
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.theme.DealiShape

/**
 * 신상마켓 디자인 시스템 XML 레이아웃용 팝업 컴포넌트.
 */
class PopupDialog private constructor(
    context: Context,
    lifecycleOwner: LifecycleOwner,
    savedStateRegistryOwner: SavedStateRegistryOwner,
    contentStrategy: ContentStrategy,
    buttonStrategy: ButtonStrategy,
    popupListener: PopupListener?,
    isCancelable: Boolean,
) {
    private val androidDialog: Dialog

    init {
        val dialogFrameView = FrameLayout(context)
        dialogFrameView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
        dialogFrameView.setViewTreeLifecycleOwner(lifecycleOwner)
        dialogFrameView.setViewTreeSavedStateRegistryOwner(savedStateRegistryOwner)

        val dialogContentView = ComposeView(context)
        dialogContentView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
        dialogContentView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow)
        dialogContentView.setContent {
            AppTheme {
                Column(
                    modifier = Modifier
                        .clip(DealiShape.radius10)
                        .background(DealiColor.primary04)
                        .width(280.dp)
                        .padding(horizontal = 20.dp),
                ) {
                    when (contentStrategy) {
                        is ContentStrategy.TitleAndMessage -> {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .defaultMinSize(minHeight = 60.dp)
                            ) {
                                Spacer(modifier = Modifier.height(24.dp))
                                DealiText(
                                    text = contentStrategy.title,
                                    style = DealiFont.sh2sb18,
                                    color = DealiColor.g100
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Spacer(modifier = Modifier.height(4.dp))
                            DealiText(
                                text = contentStrategy.message,
                                style = DealiFont.sh3r16,
                                color = DealiColor.g70
                            )
                        }

                        is ContentStrategy.OnlyMessage -> {
                            Spacer(modifier = Modifier.height(28.dp))
                            DealiText(
                                text = contentStrategy.message,
                                style = DealiFont.sh3r16,
                                color = DealiColor.g70
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    when (buttonStrategy) {
                        is ButtonStrategy.Double -> {
                            check(popupListener is DoubleButtonPopupListener?)
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                btnOutlineMedium01(
                                    modifier = Modifier.weight(1f),
                                    text = buttonStrategy.leftButtonText,
                                    onClick = {
                                        popupListener?.onLeftButtonClick(this@PopupDialog)
                                    }
                                )
                                btnFilledMedium01(
                                    modifier = Modifier.weight(1f),
                                    text = buttonStrategy.rightButtonText,
                                    onClick = {
                                        popupListener?.onRightButtonClick(this@PopupDialog)
                                    }
                                )
                            }
                        }

                        is ButtonStrategy.Single -> {
                            check(popupListener is SingleButtonPopupListener?)
                            btnFilledMedium01(
                                modifier = Modifier.fillMaxWidth(),
                                text = buttonStrategy.buttonText,
                                onClick = {
                                    popupListener?.onButtonClick(this@PopupDialog)
                                }
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))
                }
            }
        }

        dialogFrameView.addView(dialogContentView)
        androidDialog = Dialog(context)
        androidDialog.window?.setBackgroundDrawable(ColorDrawable(android.graphics.Color.TRANSPARENT))
        androidDialog.setContentView(dialogFrameView)
        androidDialog.setCancelable(isCancelable)
        androidDialog.setCanceledOnTouchOutside(isCancelable)
        androidDialog.setOnDismissListener {
            popupListener?.onDismiss(this)
        }
    }

    /** 팝업 보이기 */
    fun show() {
        androidDialog.show()
    }

    /** 팝업 숨기기 */
    fun dismiss() {
        androidDialog.dismiss()
    }

    interface PopupListener {
        fun onDismiss(popup: PopupDialog)
    }

    open class SingleButtonPopupListener : PopupListener {
        open fun onButtonClick(popup: PopupDialog) {}

        override fun onDismiss(popup: PopupDialog) {}
    }

    open class DoubleButtonPopupListener : PopupListener {
        open fun onLeftButtonClick(popup: PopupDialog) {}

        open fun onRightButtonClick(popup: PopupDialog) {}

        override fun onDismiss(popup: PopupDialog) {}
    }

    @Suppress("unused")
    class SingleButtonPopupBuilder {
        private val context: Context
        private val lifecycleOwner: LifecycleOwner
        private val savedStateRegistryOwner: SavedStateRegistryOwner
        private var title: String = ""
        private var message: String = ""
        private var buttonText: String = ""
        private var popupListener: SingleButtonPopupListener? = null
        private var isCancelable: Boolean = true

        constructor(activity: ComponentActivity) {
            this.context = activity
            this.lifecycleOwner = activity
            this.savedStateRegistryOwner = activity
        }

        constructor(fragment: Fragment) {
            this.context = fragment.requireContext()
            this.lifecycleOwner = fragment.viewLifecycleOwner
            this.savedStateRegistryOwner = fragment
        }

        /**
         * 팝업의 타이틀 설정. 설정하지 않을 시 타이틀이 없는 팝업이 만들어집니다.
         */
        fun setTitle(title: String): SingleButtonPopupBuilder {
            this.title = title
            return this
        }

        /**
         * 팝업의 본문 메세지 설정.
         */
        fun setMessage(message: String): SingleButtonPopupBuilder {
            this.message = message
            return this
        }

        /**
         * 팝업의 버튼 문구 설정.
         */
        fun setButtonText(buttonText: String): SingleButtonPopupBuilder {
            this.buttonText = buttonText
            return this
        }

        /**
         * 팝업 리스너 설정.
         */
        fun setPopupListener(popupListener: SingleButtonPopupListener): SingleButtonPopupBuilder {
            this.popupListener = popupListener
            return this
        }

        /**
         * 팝업 외부 영역을 클릭하거나 Back 버튼을 통해 닫는 동작의 허용 여부 설정.
         * `false`를 설정하는 경우 [PopupDialog.dismiss] 메소드를 통해 직접 닫기 동작을 구현해야 합니다.
         */
        fun setCancelable(isCancelable: Boolean): SingleButtonPopupBuilder {
            this.isCancelable = isCancelable
            return this
        }

        fun build(): PopupDialog {
            return PopupDialog(
                context = context,
                lifecycleOwner = lifecycleOwner,
                savedStateRegistryOwner = savedStateRegistryOwner,
                contentStrategy = if (title.isNotEmpty()) {
                    ContentStrategy.TitleAndMessage(title, message)
                } else {
                    ContentStrategy.OnlyMessage(message)
                },
                buttonStrategy = ButtonStrategy.Single(buttonText),
                popupListener = popupListener,
                isCancelable = isCancelable,
            )
        }
    }

    @Suppress("unused")
    class DoubleButtonPopupBuilder {
        private val context: Context
        private val lifecycleOwner: LifecycleOwner
        private val savedStateRegistryOwner: SavedStateRegistryOwner
        private var title: String = ""
        private var message: String = ""
        private var leftButtonText: String = ""
        private var rightButtonText: String = ""
        private var popupListener: DoubleButtonPopupListener? = null
        private var isCancelable: Boolean = true

        constructor(activity: ComponentActivity) {
            this.context = activity
            this.lifecycleOwner = activity
            this.savedStateRegistryOwner = activity
        }

        constructor(fragment: Fragment) {
            this.context = fragment.requireContext()
            this.lifecycleOwner = fragment
            this.savedStateRegistryOwner = fragment
        }

        /**
         * 팝업의 타이틀 설정. 설정하지 않을 시 타이틀이 없는 팝업이 만들어집니다.
         */
        fun setTitle(title: String): DoubleButtonPopupBuilder {
            this.title = title
            return this
        }

        /**
         * 팝업의 본문 메세지 설정.
         */
        fun setMessage(message: String): DoubleButtonPopupBuilder {
            this.message = message
            return this
        }

        /**
         * 팝업의 버튼 문구 설정.
         */
        fun setButtonText(
            leftButtonText: String,
            rightButtonText: String
        ): DoubleButtonPopupBuilder {
            this.leftButtonText = leftButtonText
            this.rightButtonText = rightButtonText
            return this
        }

        /**
         * 팝업 리스너 설정.
         */
        fun setPopupListener(popupListener: DoubleButtonPopupListener): DoubleButtonPopupBuilder {
            this.popupListener = popupListener
            return this
        }

        /**
         * 팝업 외부 영역을 클릭하거나 Back 버튼을 통해 닫는 동작의 허용 여부 설정.
         * `false`를 설정하는 경우 [PopupDialog.dismiss] 메소드를 통해 직접 닫기 동작을 구현해야 합니다.
         */
        fun setCancelable(isCancelable: Boolean): DoubleButtonPopupBuilder {
            this.isCancelable = isCancelable
            return this
        }

        fun build(): PopupDialog {
            return PopupDialog(
                context = context,
                lifecycleOwner = lifecycleOwner,
                savedStateRegistryOwner = savedStateRegistryOwner,
                contentStrategy = if (title.isNotEmpty()) {
                    ContentStrategy.TitleAndMessage(title, message)
                } else {
                    ContentStrategy.OnlyMessage(message)
                },
                buttonStrategy = ButtonStrategy.Double(leftButtonText, rightButtonText),
                popupListener = popupListener,
                isCancelable = isCancelable,
            )
        }
    }

    private sealed interface ContentStrategy {
        data class OnlyMessage(val message: String) : ContentStrategy

        data class TitleAndMessage(
            val title: String,
            val message: String,
        ) : ContentStrategy
    }

    private sealed interface ButtonStrategy {
        data class Single(val buttonText: String) : ButtonStrategy

        data class Double(
            val leftButtonText: String,
            val rightButtonText: String,
        ) : ButtonStrategy
    }
}
