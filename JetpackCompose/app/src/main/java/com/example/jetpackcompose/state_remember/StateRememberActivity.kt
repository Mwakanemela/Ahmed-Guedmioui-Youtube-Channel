package com.example.jetpackcompose.state_remember

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.state_remember.ui.theme.JetpackComposeTheme

class StateRememberActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    StateRemember(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun StateRemember(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val textVisibilityState = remember {
            mutableStateOf(true)
        }

        val text = if(textVisibilityState.value) "Text visible" else "Text not visible"
//        if(textVisibilityState.value) {
//            Text(text = "Toggle")
//        }
        Text(
            text = text,
            modifier = Modifier.alpha(
                if (textVisibilityState.value) 1f else 0.3f
            )
        )
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            textVisibilityState.value = !textVisibilityState.value
        }) {
            Text(text = "Toggle Text")
        }
    }
}


