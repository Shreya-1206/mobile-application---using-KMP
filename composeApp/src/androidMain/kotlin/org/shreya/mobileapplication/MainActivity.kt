package org.shreya.mobileapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import kotlinx.coroutines.delay
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
//    val isChecking = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val splashScreen = installSplashScreen()
//        setContent {
//           val isSplashScreenVisible = remember { mutableStateOf(true)}
//
//         LaunchedEffect(key1 = Unit) {
//            delay(2000)
//             isSplashScreenVisible.value = false
//         }
//
//            if (isSplashScreenVisible.value) {
//
//            } else {
//               App()
//            }
//        }
        installSplashScreen()

        setContent {
            App()
        }
    }
}



@Preview
@Composable
fun AppAndroidPreview() {
    App()
}