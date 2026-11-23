package com.conde.danikka.components

import androidx.compose.material3.OutlinedSecureTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import com.conde.danikka.constants.EmptyTextFieldState

@Composable
fun InputTextField(placeholderText: String) {
    TextField(
        state = EmptyTextFieldState,
        placeholder = { Text(placeholderText) }
    )
}

@Composable
fun SensitiveTextField(placeholderText : String) {
    OutlinedSecureTextField(
        state = EmptyTextFieldState,
        placeholder = { Text(placeholderText) }
    )
}