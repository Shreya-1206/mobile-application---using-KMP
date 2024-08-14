package org.shreya.mobileapplication

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview



@Composable
@Preview
fun App() {
  ///Navigation state variable
    var currentpage by remember { mutableStateOf("splash") }
    var userName by remember { mutableStateOf("") }
    var userEmail by remember { mutableStateOf("") }

    MaterialTheme {
     when (currentpage) {
         "splash" -> splash(onMoveToLogin = {currentpage = "login"})
         "login" -> loginPage(onLoginSuccess = { name, email ->
             userName = name
             userEmail = email
             currentpage = "home"
         })
         "home" -> homePage(
             name = userName,
             email = userEmail,
             onNavigateToProfile = {currentpage = "profile"})
         "profile" -> profile(
             name = userName,
             email = userEmail,
             onLogout = { currentpage = "logout"})
         "logout" -> loginPage(onLoginSuccess ={ name, email ->
             userName = name
             userEmail = email
             currentpage = "home"
         })
     }
    }
}
