package com.luizafmartinez.composedio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.Modifier.Companion.foldIn
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    //DogCard(dog = Dog("Luna", "Chow chow"))
    var clicks by remember {  mutableStateOf(0) }
        ClickCounter(clicks = clicks) {
            clicks++
    }
}

@Composable
fun ClickCounter(clicks: Int, onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text("I've been clicked $clicks times")
    }
}


/*Column(modifier = Modifier.background(androidx.compose.ui.graphics.Color.Red)) {
    Text(
        text = "Hello World",
        maxLines = 3,
        fontSize = 14.sp
    )
    Text(
        text = "Outro texto"
    )
}*/

/*  Button(
      onClick = { TODO },
      colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Red)
  ) {
      Icon(
          painter = painterResource(id = R.drawable.star_24),
          contentDescription = null
      )
      Text(text= "Confirmar",
           color = androidx.compose.ui.graphics.Color.White )
  }*/


data class Dog(
    val name: String,
    val breed: String
)

@Composable
fun DogCard(dog: Dog) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.star_24),
            contentDescription = null,
            modifier = Modifier
                .size(72.dp)
                .clip(CircleShape)
        )
        Column {
            Text(text = dog.name)
            Text(text = dog.breed)
        }

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