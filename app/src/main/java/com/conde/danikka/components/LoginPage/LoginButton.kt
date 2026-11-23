package com.conde.danikka.components.LoginPage

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.conde.danikka.components.testing.placeholder

@Composable
fun LoginButton() {
    OutlinedButton(
    onClick = { placeholder() }, Modifier.fillMaxWidth()
    ) {Text("Entrar")}
}