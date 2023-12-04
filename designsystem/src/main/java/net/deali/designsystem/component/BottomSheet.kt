package net.deali.designsystem.component

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.DrawableRes
import androidx.annotation.Px
import androidx.annotation.StringRes
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.core.view.updateLayoutParams
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.parcelize.Parcelize
import net.deali.designsystem.R
import net.deali.designsystem.databinding.FragmentBottomSheetBinding

class BottomSheet : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentBottomSheetBinding
    private var onDismiss: (() -> Unit)? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setStyle(STYLE_NORMAL, R.style.SsmModalTheme)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBottomSheetBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        processArguments()

        return binding.root
    }

    private fun processArguments() {
        val arguments = requireArguments()
        val listenerHolder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            arguments.getParcelable(KEY_LISTENER, ListenerHolder::class.java)
        } else {
            arguments.getParcelable(KEY_LISTENER)
        }
        val titleResource = arguments.getIntOrNull(KEY_TITLE_RESOURCE)
        val contentTextResource = arguments.getIntOrNull(KEY_CONTENT_TEXT_RESOURCE)
        val contentImageResource = arguments.getIntOrNull(KEY_CONTENT_IMAGE_RESOURCE)
        val primaryButtonTextResource = arguments.getIntOrNull(KEY_PRIMARY_BUTTON_TEXT_RESOURCE)
        val secondaryButtonTextResource = arguments.getIntOrNull(KEY_SECONDARY_BUTTON_TEXT_RESOURCE)
        val onPrimaryButtonClick = listenerHolder?.onPrimaryButtonClick
        val onSecondaryButtonClick = listenerHolder?.onSecondaryButtonClick

        // title
        if (titleResource != null) {
            binding.llHeader.isVisible = true
            binding.tvTitle.setText(titleResource)
            binding.ivContent.updateLayoutParams<FrameLayout.LayoutParams> { bottomMargin = 0f.toDp() }
        } else {
            binding.ivContent.updateLayoutParams<FrameLayout.LayoutParams> { bottomMargin = 8f.toDp() }
        }

        // content
        if (contentTextResource != null) {
            binding.tvContent.setText(contentTextResource)
            binding.tvContent.isVisible = true

        } else if (contentImageResource != null) {
            binding.ivContent.setImageResource(contentImageResource)
            binding.ivContent.isVisible = true
        }

        // button
        if (
            primaryButtonTextResource != null
            && secondaryButtonTextResource != null
            && onPrimaryButtonClick != null
            && onSecondaryButtonClick != null
        ) {
            binding.llButtons.isVisible = true
            binding.tvPrimaryButton.setText(primaryButtonTextResource)
            binding.tvSecondaryButton.setText(secondaryButtonTextResource)
            binding.tvPrimaryButton.setOnClickListener {
                onPrimaryButtonClick()
                dismiss()
            }
            binding.tvSecondaryButton.setOnClickListener {
                onSecondaryButtonClick()
                dismiss()
            }
        }

        // dismiss
        binding.ivXButton.setOnClickListener { dismiss() }
        onDismiss = listenerHolder?.onDismiss
    }

    private fun Bundle.getIntOrNull(key: String): Int? {
        val valueInBundle = getInt(key, -1)

        return valueInBundle.takeIf { it != -1 }
    }

    override fun dismiss() {
        super.dismissAllowingStateLoss()
        onDismiss?.invoke()
    }

    @Px
    private fun Float.toDp(): Int {
        val scale = resources.displayMetrics.density
        return (this * scale + 0.5f).toInt()
    }

    companion object {
        private const val TAG = "BottomSheet"
        private const val KEY_TITLE_RESOURCE = "KEY_TITLE_RESOURCE"
        private const val KEY_CONTENT_TEXT_RESOURCE = "KEY_CONTENT_TEXT_RESOURCE"
        private const val KEY_CONTENT_IMAGE_RESOURCE = "KEY_CONTENT_IMAGE_RESOURCE"
        private const val KEY_PRIMARY_BUTTON_TEXT_RESOURCE = "KEY_PRIMARY_BUTTON_TEXT_RESOURCE"
        private const val KEY_SECONDARY_BUTTON_TEXT_RESOURCE = "KEY_SECONDARY_BUTTON_TEXT_RESOURCE"
        private const val KEY_LISTENER = "KEY_LISTENER"

        fun show(
            fragmentManager: FragmentManager,
            @StringRes contentTextResource: Int,
            onDismiss: (() -> Unit)? = null,
        ): BottomSheet {
            val bottomSheet = BottomSheet()
            bottomSheet.arguments = bundleOf(
                KEY_CONTENT_TEXT_RESOURCE to contentTextResource,
                KEY_LISTENER to ListenerHolder(onDismiss = onDismiss),
            )
            bottomSheet.show(fragmentManager, TAG)

            return bottomSheet
        }

        fun show(
            fragmentManager: FragmentManager,
            @StringRes titleResource: Int,
            @StringRes contentTextResource: Int,
            onDismiss: (() -> Unit)? = null,
        ): BottomSheet {
            val bottomSheet = BottomSheet()
            bottomSheet.arguments = bundleOf(
                KEY_TITLE_RESOURCE to titleResource,
                KEY_CONTENT_TEXT_RESOURCE to contentTextResource,
                KEY_LISTENER to ListenerHolder(onDismiss = onDismiss),
            )
            bottomSheet.show(fragmentManager, TAG)

            return bottomSheet
        }

        fun show(
            fragmentManager: FragmentManager,
            @StringRes contentTextResource: Int,
            @StringRes primaryButtonTextResource: Int,
            @StringRes secondaryButtonTextResource: Int,
            onPrimaryButtonClick: () -> Unit,
            onSecondaryButtonClick: () -> Unit,
            onDismiss: (() -> Unit)? = null,
        ): BottomSheet {
            val bottomSheet = BottomSheet()
            bottomSheet.arguments = bundleOf(
                KEY_CONTENT_TEXT_RESOURCE to contentTextResource,
                KEY_PRIMARY_BUTTON_TEXT_RESOURCE to primaryButtonTextResource,
                KEY_SECONDARY_BUTTON_TEXT_RESOURCE to secondaryButtonTextResource,
                KEY_LISTENER to ListenerHolder(
                    onPrimaryButtonClick = onPrimaryButtonClick,
                    onSecondaryButtonClick = onSecondaryButtonClick,
                    onDismiss = onDismiss
                ),
            )
            bottomSheet.show(fragmentManager, TAG)

            return bottomSheet
        }

        fun show(
            fragmentManager: FragmentManager,
            @StringRes titleResource: Int,
            @StringRes contentTextResource: Int,
            @StringRes primaryButtonTextResource: Int,
            @StringRes secondaryButtonTextResource: Int,
            onPrimaryButtonClick: () -> Unit,
            onSecondaryButtonClick: () -> Unit,
            onDismiss: (() -> Unit)? = null,
        ): BottomSheet {
            val bottomSheet = BottomSheet()
            bottomSheet.arguments = bundleOf(
                KEY_TITLE_RESOURCE to titleResource,
                KEY_CONTENT_TEXT_RESOURCE to contentTextResource,
                KEY_PRIMARY_BUTTON_TEXT_RESOURCE to primaryButtonTextResource,
                KEY_SECONDARY_BUTTON_TEXT_RESOURCE to secondaryButtonTextResource,
                KEY_LISTENER to ListenerHolder(
                    onPrimaryButtonClick = onPrimaryButtonClick,
                    onSecondaryButtonClick = onSecondaryButtonClick,
                    onDismiss = onDismiss
                ),
            )
            bottomSheet.show(fragmentManager, TAG)

            return bottomSheet
        }

        fun showWithImage(
            fragmentManager: FragmentManager,
            @DrawableRes contentImageResource: Int,
            onDismiss: (() -> Unit)? = null,
        ): BottomSheet {
            val bottomSheet = BottomSheet()
            bottomSheet.arguments = bundleOf(
                KEY_CONTENT_IMAGE_RESOURCE to contentImageResource,
                KEY_LISTENER to ListenerHolder(onDismiss = onDismiss),
            )
            bottomSheet.show(fragmentManager, TAG)

            return bottomSheet
        }

        fun showWithImage(
            fragmentManager: FragmentManager,
            @StringRes titleResource: Int,
            @DrawableRes contentImageResource: Int,
            onDismiss: (() -> Unit)? = null,
        ): BottomSheet {
            val bottomSheet = BottomSheet()
            bottomSheet.arguments = bundleOf(
                KEY_TITLE_RESOURCE to titleResource,
                KEY_CONTENT_IMAGE_RESOURCE to contentImageResource,
                KEY_LISTENER to ListenerHolder(onDismiss = onDismiss),
            )
            bottomSheet.show(fragmentManager, TAG)

            return bottomSheet
        }

        fun showWithImage(
            fragmentManager: FragmentManager,
            @DrawableRes contentImageResource: Int,
            @StringRes primaryButtonTextResource: Int,
            @StringRes secondaryButtonTextResource: Int,
            onPrimaryButtonClick: () -> Unit,
            onSecondaryButtonClick: () -> Unit,
            onDismiss: (() -> Unit)? = null,
        ): BottomSheet {
            val bottomSheet = BottomSheet()
            bottomSheet.arguments = bundleOf(
                KEY_CONTENT_IMAGE_RESOURCE to contentImageResource,
                KEY_PRIMARY_BUTTON_TEXT_RESOURCE to primaryButtonTextResource,
                KEY_SECONDARY_BUTTON_TEXT_RESOURCE to secondaryButtonTextResource,
                KEY_LISTENER to ListenerHolder(
                    onPrimaryButtonClick = onPrimaryButtonClick,
                    onSecondaryButtonClick = onSecondaryButtonClick,
                    onDismiss = onDismiss
                ),
            )
            bottomSheet.show(fragmentManager, TAG)

            return bottomSheet
        }

        fun showWithImage(
            fragmentManager: FragmentManager,
            @StringRes titleResource: Int,
            @DrawableRes contentImageResource: Int,
            @StringRes primaryButtonTextResource: Int,
            @StringRes secondaryButtonTextResource: Int,
            onPrimaryButtonClick: () -> Unit,
            onSecondaryButtonClick: () -> Unit,
            onDismiss: (() -> Unit)? = null,
        ): BottomSheet {
            val bottomSheet = BottomSheet()
            bottomSheet.arguments = bundleOf(
                KEY_TITLE_RESOURCE to titleResource,
                KEY_CONTENT_IMAGE_RESOURCE to contentImageResource,
                KEY_PRIMARY_BUTTON_TEXT_RESOURCE to primaryButtonTextResource,
                KEY_SECONDARY_BUTTON_TEXT_RESOURCE to secondaryButtonTextResource,
                KEY_LISTENER to ListenerHolder(
                    onPrimaryButtonClick = onPrimaryButtonClick,
                    onSecondaryButtonClick = onSecondaryButtonClick,
                    onDismiss = onDismiss
                ),
            )
            bottomSheet.show(fragmentManager, TAG)

            return bottomSheet
        }
    }

    @Parcelize
    data class ListenerHolder(
        val onPrimaryButtonClick: (() -> Unit)? = null,
        val onSecondaryButtonClick: (() -> Unit)? = null,
        val onDismiss: (() -> Unit)? = null,
    ) : Parcelable
}