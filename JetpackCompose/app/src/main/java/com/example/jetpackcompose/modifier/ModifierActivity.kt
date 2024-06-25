package com.example.jetpackcompose.modifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.modifier.ui.theme.JetpackComposeTheme

class ModifierActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                ModifierDemo()
            }
        }
    }
}

@Composable
fun ModifierDemo() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f) // fill device 50%
            .background(Color.LightGray)
            .padding(40.dp)
    ) {
        Button(onClick = { }) {
            Text(text = "Button 1")
        }

        Button(onClick = { }) {
            Text(text = "Button 2")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    JetpackComposeTheme {
        ModifierDemo()
    }
}