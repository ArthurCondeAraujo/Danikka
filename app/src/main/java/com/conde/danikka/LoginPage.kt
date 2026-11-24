package com.conde.danikka

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.dp
import com.conde.danikka.components.LoginPage.DanikkaLogo
import com.conde.danikka.components.LoginPage.LoginButton
import com.conde.danikka.components.LoginPage.LoginPageBG
import com.conde.danikka.components.LoginPage.NameTextField
import com.conde.danikka.components.LoginPage.PasswordChangeText
import com.conde.danikka.components.LoginPage.RegisterText
import com.conde.danikka.components.LoginPage.SecureTextField
import com.conde.danikka.components.testing.logTest
import com.conde.danikka.ui.theme.DarkBackground

@Composable
fun LoginPage(
    viewModel: SampleViewModel,
    onNavRegister: () -> Unit,
    onLogin: () -> Unit
) {
    LoginPageBG()
    Column( horizontalAlignment = Alignment.CenterHorizontally) {
        Column() {
            DanikkaLogo()
        }
        Column(modifier = Modifier.width(IntrinsicSize.Max) .onGloballyPositioned{ coordinates -> logTest("Divider", "Width ${coordinates.size.width}") }, horizontalAlignment = Alignment.CenterHorizontally ) {
            NameTextField()
            SecureTextField()
            PasswordChangeText()
            LoginButton(onLogin)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            HorizontalDivider (
                modifier = Modifier.absolutePadding(0.dp, 300.dp, 0.dp, 15.dp),
                thickness = 3.dp,
                color = DarkBackground
            )
            RegisterText(onNavRegister)
        }
    }
}