package org.shreya.mobileapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mobileapp2.composeapp.generated.resources.Res
import mobileapp2.composeapp.generated.resources.imageprofile
import org.jetbrains.compose.resources.painterResource


@Composable
fun profile(name : String,email : String, onLogout : () -> Unit) {
    var name by remember { mutableStateOf(name) }
    var email by remember { mutableStateOf(email) }
    var phone by remember { mutableStateOf("") }

  Box(
      modifier = Modifier
          .fillMaxSize()
          .background(
              color = Color.White,
              shape= RoundedCornerShape(20.dp)
          )
  ) {
      Column(
          modifier = Modifier.fillMaxWidth()
              .padding(10.dp),
          horizontalAlignment = Alignment.CenterHorizontally,

      ) {
         Text(text = "Profile Info" ,
             fontSize = 32.sp,
             fontWeight = FontWeight.Bold
         )

          Spacer(modifier = Modifier.height(20.dp))

          val painter: Painter = painterResource(Res.drawable.imageprofile)

          Image(
              painter = painter,
              contentDescription = "Profile Image",
              modifier = Modifier
                  .size(120.dp)
                  .clip(CircleShape)
                  .border(width = 4.dp, color = Color.Black, shape = CircleShape)
          )

          Spacer(modifier = Modifier.height(20.dp))

          Text(text = "Name" , modifier = Modifier.
                            padding(end = 10.dp))

          Spacer(modifier = Modifier.height(12.dp))

          TextField(
              value = name,
              onValueChange = { name = it },
              label = { Text("Name") },
              modifier = Modifier.fillMaxWidth(),
              singleLine = true,
              keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next)
          )

          Spacer(modifier = Modifier.height(20.dp))

          Text(text = "Email" , modifier = Modifier.
          padding(end = 10.dp))

          Spacer(modifier = Modifier.height(12.dp))

          TextField(
              value = email,
              onValueChange = { email = it },
              label = { Text("Email") },
              modifier = Modifier.fillMaxWidth(),
              singleLine = true,
              keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next)
          )


          Spacer(modifier = Modifier.height(20.dp))

          Text(text = "Phone" , modifier = Modifier.
          padding(end = 10.dp))

          Spacer(modifier = Modifier.height(12.dp))

          TextField(
              value = phone,
              onValueChange = { phone = it },
              label = { Text("Phone") },
              modifier = Modifier.fillMaxWidth(),
              singleLine = true,
              keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done)
          )

          Spacer(modifier = Modifier.height(20.dp))

          Row(

          ) {
              Button(
                  onClick = {

                  },
                  modifier = Modifier.padding(10.dp),

                  ) {
                  Text(text = "Save Changes")
              }

              Button(
                  onClick = {
                    onLogout()
                  },
                  modifier = Modifier.padding(10.dp),

                  ) {
                  Text(text = "Logout")
              }
          }

      }

  }
}