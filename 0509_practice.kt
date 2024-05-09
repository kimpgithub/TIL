package com.example.a0509_jetpackcompose

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a0509_jetpackcompose.ui.theme._0509_jetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _0509_jetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        for (i in 1..10) {
            LoginTitle(i)
            Sample2(name = "$i")
        }
    }
}

@Composable
fun LoginTitle(index: Int) {
    Row {
        Text(
            text = "$index", fontSize = (8 + index).sp
        )

    }
}

@Composable
fun Sample2(name: String, modifier: Modifier = Modifier) {
// 기본 형태 : 가로(수평방향배치)
    Column {

        Divider(
            thickness = 2.dp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _0509_jetpackComposeTheme {
        Greeting("Android")
    }
}
