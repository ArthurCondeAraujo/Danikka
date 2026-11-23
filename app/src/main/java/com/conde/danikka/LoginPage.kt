package com.conde.danikka

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedSecureTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import com.conde.danikka.components.LoginPage.NameTextField
import com.conde.danikka.components.LoginPage.PasswordChangeText
import com.conde.danikka.components.LoginPage.RegisterText
import com.conde.danikka.components.LoginPage.SecureTextField
import com.conde.danikka.components.testing.logTest
import com.conde.danikka.components.testing.placeholder
import com.conde.danikka.constants.EmptyTextFieldState

@Composable
fun LoginPage() {
    Column( horizontalAlignment = Alignment.CenterHorizontally) {
        Column(modifier = Modifier.width(IntrinsicSize.Max) .onGloballyPositioned{ coordinates -> logTest("Divider", "Width ${coordinates.size.width}") }, horizontalAlignment = Alignment.CenterHorizontally ) {
            NameTextField()
            SecureTextField()
            PasswordChangeText()
            OutlinedButton(onClick = { placeholder() }, Modifier.fillMaxWidth()) {Text("Entrar")}
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            HorizontalDivider ()
            RegisterText()
        }
    }
}