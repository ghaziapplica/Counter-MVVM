package com.example.camtaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.camtaingame.ui.theme.CamtainGameTheme
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CamtainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                CamtainGame()
                }
            }
        }
    }
    @Composable
    fun CamtainGame () {
        val treasuresFound = remember { mutableStateOf(0)}
        val direction = remember { mutableStateOf("North")}
        val stromOrTreasure = remember { mutableStateOf("")}

        Column {
            Text(text = "Treasure Found : ${treasuresFound.value}")
            Text(text = "Current direction : ${direction.value}")
            Text(text = "${stromOrTreasure.value}")
            Button(onClick = {
                direction.value = "East"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    stromOrTreasure.value = "we found a teasure!!!"
                }else {
                    stromOrTreasure.value = "Strome ahead!!!"
                }
            }) {
             Text(text = "Sale East")
            }
            Button(onClick = {
                direction.value = "West"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    stromOrTreasure.value = "we found a teasure!!!"
                }else {
                    stromOrTreasure.value = "Strome ahead!!!"
                }
            }) {
                Text(text = "Sale West")
            }
            Button(onClick = {
                direction.value = "North"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    stromOrTreasure.value = "we found a teasure!!!"
                }else {
                    stromOrTreasure.value = "Strome ahead!!!"
                }
            }) {
                Text(text = "Sale North")
            }
            Button(onClick = {
                direction.value = "South"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    stromOrTreasure.value = "we found a teasure!!!"
                }else {
                    stromOrTreasure.value = "Strome ahead!!!"
                }
            }) {
                Text(text = "Sale South")
            }

        }

    }
}

