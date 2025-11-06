package com.example.practicumguide

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practicumguide.ui.theme.PracticumGuideTheme

class SecondScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticumGuideTheme()
            {
                var ItemName by remember()
                {
                    mutableStateOf("")
                }

                var Category by remember()
                {
                    mutableStateOf("")
                }

                var Quantity by remember()
                {
                    mutableStateOf("")
                }

                var Comment by remember()
                {
                    mutableStateOf("")
                }

                Column (
                    modifier= Modifier.fillMaxSize(), //to expand the wrap to fill the entire screen
                    horizontalAlignment=Alignment.CenterHorizontally, //this is going to center the composables horizontally
                    verticalArrangement = Arrangement.Center
                )
                {
                    Divider()
                    Spacer(modifier = Modifier.size(30.dp))
                    Text("Enter Details")              //Topic



                    OutlinedTextField(                                             //Answer q1
                        value = ItemName,
                        onValueChange = { text -> ItemName = text },
                        placeholder = { Text(text = "Answer") }
                    )

                    Spacer(modifier = Modifier.size(30.dp))
                    Text("")                      //Question2


                    OutlinedTextField(
                        value = Category,
                        onValueChange = { text -> Category = text },
                        placeholder = { Text(text = "Answer now") }
                    )

                    Spacer(modifier = Modifier.size(30.dp))
                    Text("")


                    OutlinedTextField(
                        value = Quantity,
                        onValueChange = { text -> Quantity = text },
                        placeholder = { Text(text = "Quantity") }
                    )

                    Spacer(modifier = Modifier.size(30.dp))
                    Text("")                  //


                    OutlinedTextField(
                        value = Comment,
                        onValueChange = { text -> Comment = text },
                        placeholder = { Text(text = "Comments") }

                    )
                    Spacer(modifier = Modifier.size(30.dp))

                    Row ()
                    {
                        Button(onClick = {

                        }
                        )
                        {
                            Text("Back")
                        }

                        Button(onClick = {
                            var back = Intent(this@SecondScreen, ThirdScreen::class.java)
                            startActivity(back)
                        }
                        )
                        {
                            Text("Add")
                        }

                        Button(onClick = {
                            var exit = Intent(this@SecondScreen, MainActivity::class.java)
                            startActivity(exit)
                        }
                        )
                        {
                            Text("Exit")
                        }
                    }
                }
            }
        }
    }
}

