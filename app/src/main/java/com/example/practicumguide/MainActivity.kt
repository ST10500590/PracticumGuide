package com.example.practicumguide

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.practicumguide.ui.theme.PracticumGuideTheme
import android.R.attr.value
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticumGuideTheme ()
            {
                Column(
                    modifier= Modifier.fillMaxSize(), //to expand the wrap to fill the entire screen
                    horizontalAlignment=Alignment.CenterHorizontally, //this is going to center the composables horizontally
                    verticalArrangement = Arrangement.Center
                )
                {
                    Text(text = "Welcome",
                            fontSize = 30.sp,
                        fontWeight = FontWeight.Black)


                    Button(onClick = {
                        var start = Intent(this@MainActivity, SecondScreen::class.java)
                        startActivity(start)
                    })
                    {
                        Text("Start") // Text of the button to be "Start"
                    }
                }

            }
        }
    }
}

