    package com.conde.danikka

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.conde.danikka.ui.theme.DanikkaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DanikkaTheme {
                LoginPage()
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Preview(showBackground = true)
@Composable
fun LoginPagePreview() {
    DanikkaTheme {
        LoginPage()
    }
}


//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    DanikkaTheme {
//        Greeting("Android")
//    }
//}