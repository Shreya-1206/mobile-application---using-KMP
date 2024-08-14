package org.shreya.mobileapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import mobileapp2.composeapp.generated.resources.Res
import mobileapp2.composeapp.generated.resources.logo
import org.jetbrains.compose.resources.painterResource

@Composable
fun splash (onMoveToLogin : () -> Unit) {
   Box(
       modifier = Modifier
           .fillMaxSize()
           .fillMaxWidth()
           .background(
               color = Color.Transparent,
               shape = RoundedCornerShape(2)
           ),
       contentAlignment = Alignment.Center
   ) {
       val painter: Painter = painterResource(Res.drawable.logo)

       Image(
           painter = painter,
           contentDescription = "Logo Image",
           modifier = Modifier
               .size(300.dp)
               .clip(CircleShape)
       )
   }
    LaunchedEffect(Unit) {

        kotlinx.coroutines.delay(2000) // 2 seconds delay
        onMoveToLogin()
    }
}