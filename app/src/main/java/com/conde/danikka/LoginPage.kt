package com.conde.danikka

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.conde.danikka.components.InputTextField
import com.conde.danikka.components.SensitiveTextField

@Composable
fun LoginPage() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        InputTextField("Digite seu nome de usuária")
        SensitiveTextField("Digite sua senha")
        OutlinedButton(onClick = {placeholder()}) {Text("Entrar")}
        HorizontalDivider()
    }
}

fun placeholder() {
    Log.d("Placeholder Function", "Alive.")
}