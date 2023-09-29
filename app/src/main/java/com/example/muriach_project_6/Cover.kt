package com.example.muriach_project_6

import android.graphics.Paint.Align
import android.graphics.Paint.Style
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Cover(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        Arrangement.Center
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.android),
                contentDescription = "",
                modifier = Modifier
                    .size(200.dp)
                    .padding(bottom = 30.dp)
                    .fillMaxWidth(),
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {

            Text(
                text = "Exercises Project 6",
                fontSize = 40.sp,
                modifier = Modifier.padding(20.dp)
            )

            Spacer(modifier = Modifier.size(30.dp))
        }

        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { navController.navigate("Exercise1") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)

            ) {
                Text(
                    text = "Exercise 1",
                    color = Color.Black
                )
            }

        }

        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { navController.navigate("Exercise2") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

            ) {
                Text(text = "Exercise 2")
            }

        }

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { navController.navigate("Exercise3") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)

            ) {
                Text(
                    text = "Exercise 3",
                    color = Color.Black
                )
            }
        }
    }
}