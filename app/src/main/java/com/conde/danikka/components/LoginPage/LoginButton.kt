package com.conde.danikka.components.LoginPage

import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.conde.danikka.ui.theme.DarkRegisterButton
import com.conde.danikka.ui.theme.DarkText

@Composable
fun LoginButton(onLogin: () -> Unit) {
    Button(
    onClick = { onLogin() }, Modifier.width(325.dp),
    colors = ButtonColors(
        containerColor = DarkRegisterButton,
        contentColor = DarkText,
        disabledContainerColor = DarkRegisterButton,
        disabledContentColor = DarkText
    )
    ) {Text("Entrar")}
}