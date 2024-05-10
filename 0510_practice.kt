package com.example.a0509_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.sp


class StateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var showText by remember { mutableStateOf(true) }
            Row {
                StateButton(showText)
                RecordShowButton(showText, { showText = true })
                RecordHideButton(showText, { showText = false })
            }
        }
    }


    @Composable
    fun StateButton(showText: Boolean) {var count by remember { mutableStateOf(0) }
        Column {
            Button(onClick = { count++ }) {
                Text(text = "저장", fontSize = 24.sp)
            }
            if (showText) {
                for (i in 1..count) {
                    Text(text = "$i : 저장했어요.")
                }
            }
        }
    }

    @Composable
    fun RecordShowButton(showText: Boolean, setShowText: (Boolean) -> Unit) {
        Button(
            onClick = { setShowText(true) },
            enabled = !showText
        ) {
            Text(text = "기록 보임", fontSize = 12.sp)
        }
    }

    @Composable
    fun RecordHideButton(showText: Boolean, setShowText: (Boolean) -> Unit) {

        Button(
            onClick = { setShowText(false) },
            enabled = showText
        ) {
            Text(text = "기록 숨김", fontSize = 12.sp)
        }
    }
}
