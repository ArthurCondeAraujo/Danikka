package com.conde.danikka.components.LoginPage

import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedSecureTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.conde.danikka.constants.EmptyTextFieldState
import com.conde.danikka.constants.TextFieldShape
import com.conde.danikka.ui.theme.DarkInputBackground
import com.conde.danikka.ui.theme.DarkInputBorder
import com.conde.danikka.ui.theme.DarkInputText

@Composable
fun SecureTextField() {
    OutlinedSecureTextField(
        state = EmptyTextFieldState,
        modifier = Modifier.fillMaxWidth().absolutePadding(0.dp, 20.dp, 0.dp, 5.dp),
        placeholder = { Text("Digite sua senha") },
        shape = TextFieldShape,
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = DarkInputBackground,
            unfocusedContainerColor = DarkInputBackground,
            focusedTextColor = DarkInputText,
            focusedBorderColor = DarkInputBorder,
            unfocusedBorderColor = DarkInputBorder,
            unfocusedTextColor = DarkInputText
        )
    )
}