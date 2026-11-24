    package com.conde.danikka

import android.content.pm.ActivityInfo
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
                NavigationSetup()
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
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


//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    DanikkaTheme {
//        Greeting("Android")
//    }
//}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    DanikkaTheme {
        MainPage()
    }
}