package com.luizafmartinez.composedio

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.luizafmartinez.composedio.ui.theme.ComposeDIOTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDIOTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
//    Text(text = "Texto com Compose")
//    Text(text = "Outro texto")
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Red)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.star_24),
            contentDescription = null
        )
        Text(text= "Confirmar",
             color = androidx.compose.ui.graphics.Color.White )
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeDIOTheme {
        Greeting("Compose")
    }
}