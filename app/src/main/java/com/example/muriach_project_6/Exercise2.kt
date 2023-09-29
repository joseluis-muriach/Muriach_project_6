package com.example.muriach_project_6

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

/*
In this exercise we calculate the square of the even number or yours cube if is odd
*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise2(navController: NavController) {
    //Title
    Text(
        text = "Welcome to: \n 'Calculate the square or cube of your number'",
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 20.sp
        ),
        color = Color.Blue,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 20.dp),
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        Row {
            Text(
                text = "In this program, if you have an even number, we will calculate its square, " +
                    "If the number is odd, we will calculate the cube.",
                Modifier.padding(10.dp))
        }

        //Declaration of variables
        var inputNumber by remember { mutableStateOf("") }
        var result by remember { mutableStateOf("") }
        var text by remember { mutableStateOf("") }

        OutlinedTextField(
            value = inputNumber,
            onValueChange = { inputNumber = it },
            label = {
                Text("Introduce a number")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        //When we push the button it make the operations
        Button(
            onClick = {
                if ((inputNumber.toInt() % 2) == 0) {
                    result = (inputNumber.toInt() * inputNumber.toInt()).toString()
                    text = "The number is even and the result is $result"
                } else {
                    result =
                        (inputNumber.toInt() * inputNumber.toInt() * inputNumber.toInt()).toString()
                    text = "The number is odd and the result is $result"
                }
            },
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = "Calculate")
        }

        Text(
            text = text,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp
            )
        )

        //This button allows to go to "Cover" (also in Exercises 2,3 and 4)
        Button(
            onClick = {navController.navigate("Cover")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End)

        ) {
            Text(text = "Previous")
        }
    }
}

