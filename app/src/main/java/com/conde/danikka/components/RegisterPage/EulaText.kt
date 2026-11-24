package com.conde.danikka.components.RegisterPage

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import com.conde.danikka.ui.theme.DarkText

@Composable
fun EulaText(onEula: () -> Unit) {
    Column() {
        Text(
            buildAnnotatedString {
                append("Ao apertar em Registrar, você está concordando com os nossos")
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append(" Termos de serviço e Política de privacidade.")
                }
            },
            Modifier.clickable { onEula() },
            color = DarkText
        )
    }
}