package com.luizafmartinez.composedio.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
//import androidx.compose.ui.tooling.data.EmptyGroup.name
import com.luizafmartinez.composedio.MainScreen

class ListActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDIOTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ListScreen()
                }
            }
        }
    }

    data class Person(
        val name: String
    )

    @Composable
    fun ListScreen() {
        val personList = listOf(
            Person("John Doe"),
            Person("Zé Ruela"),
            Person("Juca Bala"),
            Person("Zé Buscapé")
        )

        LazyColumn(
            modifier = Modifier.background(Color.Yellow),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            items(personList) { item ->
                ItemList(name = item.name)
            }
        }
    }

    @Composable
    fun ItemList(name: String) {
        Text(
            text = name,
            modifier = Modifier.background(Color.LightGray)
        )
    }

    /* LazyRow {
         items(personList) { item ->
             ItemList(name = item.name)
         }
     }*/

    /* Column {
         personList.forEach {
             ItemList(name = it.name)
         }
     }*/
}