package com.conde.danikka.components.LoginPage

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import com.conde.danikka.constants.EmptyTextFieldState

@Composable
fun NameTextField () {
    TextField(
        state = EmptyTextFieldState,
        placeholder = { Text("Digite seu nome de usuária") }
    )
}