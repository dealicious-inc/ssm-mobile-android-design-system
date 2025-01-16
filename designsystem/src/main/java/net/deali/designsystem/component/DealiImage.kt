package net.deali.designsystem.component


import android.graphics.Bitmap
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.imageLoader
import coil.memory.MemoryCache
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.deali.designsystem.R
import net.deali.designsystem.theme.DealiColor

//
//@Composable
//fun LoadableAsyncImage(
//    imagePath: String,
//    modifier: Modifier = Modifier,
//    @DrawableRes placeholder: Int? = R.drawable.img_empty_1_1,
//    contentScale: ContentScale = ContentScale.Crop,
//    contentDescription: String? = null,
//) {
//    /**
//     * 이미지 프리뷰용
//     * imagePath 가 있으면 내부 확인용 이미지 style_import_duty 로딩
//     * imagePath 가 없으면 placeholder 가 나옴
//     */
//    if (LocalInspectionMode.current && imagePath.isNotEmpty()) {
//        Box(
//            modifier = modifier
//                .background(brush = DealiColor.gradient),
//        )
//    } else {
//        AsyncImage(
//            modifier = modifier.background(color = DealiColor.g10),
//            placeholder = if (placeholder != null) painterResource(placeholder) else null,
//            error = if (placeholder != null) painterResource(placeholder) else null,
//            model = ImageRequest.Builder(LocalContext.current)
//                .data(if (isHttpImageFile(imagePath)) imagePath else File(imagePath))
//                .crossfade(true)
//                .build(),
//            contentScale = contentScale,
//            contentDescription = contentDescription
//        )
//    }
//}

@Composable
fun TestAsyncImage(
    modifier: Modifier = Modifier,
//    model: Any?,
    imagePath: String?,
    contentDescription: String? = null,
    placeholder: Int? = null,
    placeholderMemoryCacheKey: String? = null,
    loadingIndicatorSize: Dp = 40.dp,
    contentScale: ContentScale = ContentScale.Fit,
) {
    val imageLoader = LocalContext.current.imageLoader
    var placeholderBitmap by remember(placeholderMemoryCacheKey) { mutableStateOf<Bitmap?>(null) }
    var isLoading by rememberSaveable(imagePath) { mutableStateOf(true) }

    val scope = rememberCoroutineScope()

    LaunchedEffect(placeholderMemoryCacheKey) {
        placeholderMemoryCacheKey?.let {
            placeholderBitmap =
                imageLoader.memoryCache?.get(MemoryCache.Key(placeholderMemoryCacheKey))?.bitmap
        }
    }

    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
    ) {
        AsyncImage(
            modifier = Modifier.fillMaxSize(),
            model = imagePath,
            contentDescription = contentDescription,
            contentScale = contentScale,
            onSuccess = {
                scope.launch {
                    delay(5000)
                }
                isLoading = false
            },
        )

        AnimatedVisibility(
            visible = isLoading,
            enter = fadeIn(),
            exit = fadeOut(),
        ) {
//            if (placeholderBitmap == null) {
//                Text("TODO")
//            } else {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(R.drawable.ic_mbs),
                    contentDescription = contentDescription,
                    contentScale = contentScale,
                )
//            }
        }
    }
}

fun isHttpImageFile(imagePath: String) = imagePath.contains("http")


@Preview
@Composable
private fun CommonComposeImagePreview1() {
    Row(
        modifier = Modifier
            .background(DealiColor.primary05)
            .padding(30.dp)
    ) {
        TestAsyncImage(
            modifier = Modifier.size(100.dp),
            imagePath = "test"
        )
        HorizontalSpacer(width = 20.dp)
        TestAsyncImage(
            modifier = Modifier.size(100.dp),
            imagePath = ""
        )
    }
}

@Preview
@Composable
private fun CommonComposeImagePreview2() {
    Row(
        modifier = Modifier
            .background(DealiColor.primary05)
            .padding(30.dp)
    ) {
        TestAsyncImage(
            modifier = Modifier
                .width(100.dp)
                .height(300.dp),
            imagePath = "test"
        )
        HorizontalSpacer(width = 20.dp)
        TestAsyncImage(
            modifier = Modifier
                .width(100.dp)
                .height(300.dp),
            imagePath = ""
        )
    }
}

@Preview(widthDp = 700)
@Composable
private fun CommonComposeImagePreview3() {
    Row(
        modifier = Modifier
            .background(DealiColor.primary05)
            .padding(30.dp)
    ) {
        TestAsyncImage(
            modifier = Modifier
                .width(300.dp)
                .height(100.dp),
            imagePath = "test"
        )
        HorizontalSpacer(width = 20.dp)
        TestAsyncImage(
            modifier = Modifier
                .width(300.dp)
                .height(100.dp),
            imagePath = ""
        )
    }
}

@Preview
@Composable
private fun CommonComposeImagePreview4() {
    Row(
        modifier = Modifier
            .background(DealiColor.primary05)
            .padding(30.dp)
    ) {
        TestAsyncImage(
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(4.dp))
                .border(2.dp, DealiColor.primary01, RoundedCornerShape(size = 4.dp)),
            imagePath = "test",
        )
        HorizontalSpacer(width = 20.dp)
        TestAsyncImage(
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(4.dp))
                .border(2.dp, DealiColor.primary01, RoundedCornerShape(size = 4.dp)),
            imagePath = "",
        )
    }
}

@Preview
@Composable
private fun CommonComposeImagePreview5() {
    Row(
        modifier = Modifier
            .background(DealiColor.primary05)
            .padding(30.dp)
    ) {
        TestAsyncImage(
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(2.dp, DealiColor.primary01, CircleShape),
            imagePath = "test",
        )
        HorizontalSpacer(width = 20.dp)
        TestAsyncImage(
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(2.dp, DealiColor.primary01, CircleShape),
            imagePath = "",
        )
    }
}

@Preview
@Composable
private fun CommonComposeImagePreview6() {
    Row(
        modifier = Modifier
            .background(DealiColor.primary05)
            .padding(30.dp)
    ) {
        TestAsyncImage(
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(26.dp))
                .border(3.dp, DealiColor.primary01, RoundedCornerShape(26.dp)),
            imagePath = "test",
            placeholder = R.drawable.ic_mbs,
        )
        HorizontalSpacer(width = 20.dp)
        TestAsyncImage(
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(26.dp))
                .border(3.dp, DealiColor.primary01, RoundedCornerShape(26.dp)),
            imagePath = "",
            placeholder = R.drawable.ic_home_filled,
        )
    }
}