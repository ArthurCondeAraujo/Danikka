package com.conde.danikka

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import com.conde.danikka.components.LoginPage.DanikkaLogo
import com.conde.danikka.components.LoginPage.LoginButton
import com.conde.danikka.components.LoginPage.NameTextField
import com.conde.danikka.components.LoginPage.PasswordChangeText
import com.conde.danikka.components.LoginPage.RegisterText
import com.conde.danikka.components.LoginPage.SecureTextField
import com.conde.danikka.components.testing.logTest

@Composable
fun LoginPage(
    viewModel: SampleViewModel,
    onNavRegister: () -> Unit,
    onLogin: () -> Unit
) {
    Column( horizontalAlignment = Alignment.CenterHorizontally) {
        Column(modifier = Modifier.width(IntrinsicSize.Max) .onGloballyPositioned{ coordinates -> logTest("Divider", "Width ${coordinates.size.width}") }, horizontalAlignment = Alignment.CenterHorizontally ) {
            DanikkaLogo()
            NameTextField()
            SecureTextField()
            PasswordChangeText()
            LoginButton(onLogin)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            HorizontalDivider ()
            RegisterText(onNavRegister)
        }
    }
}