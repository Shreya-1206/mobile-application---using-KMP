package org.shreya.mobileapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.Rgb
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import mobileapp2.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.painterResource


@Composable
fun homePage(name : String, email : String,  onNavigateToProfile : (String) -> Unit) {
  Column (
      modifier = Modifier
          .fillMaxSize()
          .padding(10.dp)
          .background(Color.White)
  ) {
      Box(
       modifier = Modifier.fillMaxWidth()
           .padding(5.dp)
           .height(100.dp)
           .background(
               Color(0xFF9999FF),
               shape = RoundedCornerShape(10.dp)
           ),

      ) {
          Row(
              modifier = Modifier
                  .fillMaxWidth()
                  .padding(15.dp),
              verticalAlignment = Alignment.CenterVertically
          ) {
              Text(
                  text = "Welcome $name",
                  modifier = Modifier
                      .fillMaxSize().padding(6.dp, 15.dp, 6.dp, 10.dp)
                      .weight(1f),
                  fontSize = 22.sp,
                  color = Color.Black,
                  fontWeight = FontWeight.Bold
              )
              Icon(
                  imageVector = Icons.Default.AccountCircle,
                  contentDescription = "Profile Icon",
                  modifier = Modifier.size(60.dp).clickable {
                      onNavigateToProfile(name)
                  },
                  tint = Color.Black
              )

              Icon(
                  imageVector = Icons.Default.Lock,
                  contentDescription = "Login",
                  modifier = Modifier.size(60.dp).clickable { true },
                  tint = Color.Black
              )
          }
      }

      Box(
          modifier = Modifier
              .fillMaxWidth()
              .background(
                  color = Color(0xFFCCCCFF),
                  shape = RoundedCornerShape(15.dp)
              )
              .padding(9.dp)
              .height(570 .dp),

      )
      {
        Column(
            modifier = Modifier
                .fillMaxSize()

        ) {
            // here comes the title of summary
            //box1

             Box(
                 modifier= Modifier
                     .fillMaxWidth()
                     .height(60.dp)
                     .padding(8.dp)
                     .background(
                         color = Color(0xFF9999FF ),
                         shape = RoundedCornerShape(2.dp)
                     )
             ) {
                Text(text ="Nature is Beauty...",
                    modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),

                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    )
             }

            //here comes the summary of app
            //box2
            Text(text = "Nature offers a serene escape from the hustle and bustle of daily life, with its breathtaking landscapes and calming presence. From towering mountains to tranquil rivers, the natural world reminds us of the harmony and balance that exists all around us.",
                modifier = Modifier.fillMaxWidth().padding(10.dp),
                style = androidx.compose.ui.text.TextStyle(
                        lineHeight = 28.sp
                ),
                fontSize = 25.sp,
                color = Color.Black

            )
            //comes the cards in Row

            Row(

            ) {

            }
        }
      }
      Row(
          modifier = Modifier
              .fillMaxWidth()
              .background(
                  color = Color(0xFF9999FF),
                  shape = RoundedCornerShape(15.dp)
              )
              .padding(15.dp)
              .height(100.dp),
          horizontalArrangement = Arrangement.SpaceEvenly, // Distributes space evenly
//          verticalAlignment = Alignment.CenterVertically // Aligns items vertically in the center

      ) {
          Icon(
              imageVector = Icons.Default.Home,
              contentDescription = "Home Icon",
              modifier = Modifier.size(60.dp).clickable { true },
              tint = Color.Black
          )
          Icon(
              imageVector = Icons.Default.Email,
              contentDescription = "Profile Icon",
              modifier = Modifier.size(60.dp).clickable { true },
              tint = Color.Black
          )
          Icon(
              imageVector = Icons.Default.Favorite,
              contentDescription = "Profile Icon",
              modifier = Modifier.size(60.dp).clickable { true },
              tint = Color.Black
          )

      }
  }
}


@Composable
fun imageCard(
    painter : Painter,
    contentDescription : String,
    title : String,
    modifier :Modifier = Modifier
) {
    Card (
        modifier = Modifier.fillMaxWidth(),
        shape= RoundedCornerShape(15.dp),
        elevation = 7.dp
    ){
        Box (
            modifier = Modifier.height(200.dp)){
            Image(
                painter = painter,
                contentDescription ,
                contentScale = ContentScale.Crop)
            Box (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(title, style = TextStyle(
                    color = Color.White,
                    fontSize = 16.sp
                ))
            }
        }
    }
}