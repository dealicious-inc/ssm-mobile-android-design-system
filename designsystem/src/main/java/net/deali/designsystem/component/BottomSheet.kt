package net.deali.designsystem.component

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.DrawableRes
import androidx.annotation.Px
import androidx.annotation.StringRes
import androidx.compose.ui.unit.dp
import androidx.core.view.isVisible
import androidx.core.view.marginBottom
import androidx.core.view.updateLayoutParams
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import net.deali.designsystem.databinding.FragmentBottomSheetBinding

class BottomSheet : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentBottomSheetBinding

    var titleResource: Int? = null
        set(value) {
            if (value == null) {
                binding.llHeader.isVisible = false
                binding.tvTitle.setText(0)
                binding.ivContent.updateLayoutParams<FrameLayout.LayoutParams> { bottomMargin = 8f.toDp() }

            } else {
                binding.llHeader.isVisible = true
                binding.tvTitle.setText(value)
                binding.ivContent.updateLayoutParams<FrameLayout.LayoutParams> { bottomMargin = 0f.toDp() }
            }

            field = value
        }

    @DrawableRes
    var contentImageResource: Int? = null
        set(value) {
            if (value == null) {
                binding.ivContent.setImageResource(0)
                binding.ivContent.isVisible = false

            } else {
                binding.ivContent.setImageResource(value)
                binding.ivContent.isVisible = true
                binding.tvContent.isVisible = false
            }

            field = value
        }

    @StringRes
    var contentTextResource: Int? = null
        set(value) {
            if (value == null) {
                binding.tvContent.setText(0)
                binding.tvContent.isVisible = false

            } else {
                binding.tvContent.setText(value)
                binding.tvContent.isVisible = true
                binding.ivContent.isVisible = false
            }

            field = value
        }

    @StringRes
    var secondaryButtonTextResource: Int? = null
        set(value) {
            if (value == null) {
                binding.tvSecondaryButton.setText(0)
            } else {
                binding.tvSecondaryButton.setText(value)
            }

            field = value
        }

    @StringRes
    var primaryButtonTextResource: Int? = null
        set(value) {
            if (value == null) {
                binding.tvPrimaryButton.setText(0)
            } else {
                binding.tvPrimaryButton.setText(value)
            }

            field = value
        }

    var onSecondaryButtonClick: (() -> Unit)? = null
        set(value) {
            if (value == null) {
                binding.tvSecondaryButton.setOnClickListener(null)
                binding.llButtons.isVisible = binding.tvPrimaryButton.hasOnClickListeners()

            } else {
                binding.tvSecondaryButton.setOnClickListener { value() }
                binding.llButtons.isVisible = binding.tvPrimaryButton.hasOnClickListeners()
            }

            field = value
        }

    var onPrimaryButtonClick: (() -> Unit)? = null
        set(value) {
            if (value == null) {
                binding.tvPrimaryButton.setOnClickListener(null)
                binding.llButtons.isVisible = binding.tvSecondaryButton.hasOnClickListeners()

            } else {
                binding.tvPrimaryButton.setOnClickListener { value() }
                binding.llButtons.isVisible = binding.tvSecondaryButton.hasOnClickListeners()
            }

            field = value
        }

    var onDismiss: (() -> Unit)? = null

    override fun dismiss() {
        super.dismissAllowingStateLoss()
        onDismiss?.invoke()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBottomSheetBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        binding.ivXButton.setOnClickListener { dismiss() }

        return binding.root
    }

    @Px
    private fun Float.toDp(): Int {
        val scale = resources.displayMetrics.density
        return (this * scale + 0.5f).toInt()
    }
}