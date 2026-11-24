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
import com.conde.danikka.components.LoginPage.LoginPageBG
import com.conde.danikka.components.RegisterPage.BirthdayField
import com.conde.danikka.components.RegisterPage.DanikkaLogo2
import com.conde.danikka.components.RegisterPage.EmailField
import com.conde.danikka.components.RegisterPage.EulaText
import com.conde.danikka.components.RegisterPage.LoginText
import com.conde.danikka.components.RegisterPage.NameCreationField
import com.conde.danikka.components.RegisterPage.RegisterButton
import com.conde.danikka.components.RegisterPage.SecureTextField2
import com.conde.danikka.components.testing.logTest
import com.conde.danikka.ui.theme.DarkBackground

@Composable
fun RegisterPage(
    viewModel: SampleViewModel,
    onNavLogin: () -> Unit,
    onNavEula: () -> Unit,
    onRegister: () -> Unit
) {
    LoginPageBG()
    Column( horizontalAlignment = Alignment.CenterHorizontally) {
        Column() {
            DanikkaLogo2()
        }
        Column(modifier = Modifier.width(IntrinsicSize.Max) .onGloballyPositioned{ coordinates -> logTest("Divider", "Width ${coordinates.size.width}") }, horizontalAlignment = Alignment.CenterHorizontally ) {
            NameCreationField()
            EmailField()
            SecureTextField2()
            BirthdayField()
            EulaText(onNavEula)
            RegisterButton(onRegister)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            HorizontalDivider (
                modifier = Modifier.absolutePadding(0.dp, 10.dp, 0.dp, 15.dp),
                thickness = 3.dp,
                color = DarkBackground
            )
            LoginText(onNavLogin)
        }
    }
}