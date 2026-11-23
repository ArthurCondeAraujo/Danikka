package com.conde.danikka.components.LoginPage

import androidx.compose.material3.OutlinedSecureTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.conde.danikka.constants.EmptyTextFieldState
import com.conde.danikka.constants.TextFieldShape

@Composable
fun SecureTextField() {
    OutlinedSecureTextField(
        state = EmptyTextFieldState,
        placeholder = { Text("Digite sua senha") },
        shape = TextFieldShape
    )
}