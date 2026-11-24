package com.conde.danikka.components.LoginPage

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LoginButton(onLogin: () -> Unit) {
    OutlinedButton(
    onClick = { onLogin() }, Modifier.fillMaxWidth()
    ) {Text("Entrar")}
}