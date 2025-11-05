package com.example.practicumguide

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.practicumguide.ui.theme.PracticumGuideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticumGuideTheme ()
            {
                Column()
                {
                    Text("Welcome")
                }

                Button(onClick={
                    var start= Intent(this@MainActivity, SecondScreen::class.java)
                    startActivity(start)
                } )
                {
                    Text("Start") // Text of the button to be "Start"
                }

            }
        }
    }
}

