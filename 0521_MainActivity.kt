package com.example.counter_0521

import android.content.Context
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
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.edit
import com.example.counter_0521.ui.theme.Counter_0521Theme
import java.time.LocalDate
import java.time.LocalDateTime


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Counter_0521Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable


fun MainScreen(name: String, modifier: Modifier = Modifier) {
    val activity = LocalContext.current as? MainActivity

    val sharedPref = remember { activity?.getPreferences(Context.MODE_PRIVATE) }
    var clickcount by remember {
        val saveCount = sharedPref?.getInt("lastCount", 0)
        mutableIntStateOf(saveCount ?: 0)
    }

    var localDateTime by remember { mutableStateOf(LocalDateTime.now()) }

    var buttonStates by remember { mutableStateOf(listOf(true, true, true, true, true)) }

    buttonStates = listOf(
        clickcount < Int.MAX_VALUE,
        true,
        true,
        clickcount < Int.MAX_VALUE/2-1,
        true
    )

    var snapshotCount by remember {
        val snapshotValue = sharedPref?.getInt("snapshotCount", 0)
        mutableIntStateOf(snapshotValue ?: 0)
    }


    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                clickcount++
                sharedPref?.edit {
                    putInt("lastCount", clickcount)
                }
                localDateTime = LocalDateTime.now()
            },
            enabled = buttonStates[0]
        ) {
            Text(text = "plus count $clickcount")
        }
        Button(
            onClick = {
                clickcount--
                sharedPref?.edit {
                    putInt("lastCount", clickcount)
                }
                localDateTime = LocalDateTime.now()
            },
            enabled = buttonStates[1]
        ) {
            Text(text = "minus count $clickcount")
        }
        Button(
            onClick = {
                clickcount = 0
                sharedPref?.edit {
                    putInt("lastCount", clickcount)
                }
                localDateTime = LocalDateTime.now()
            },
            enabled = buttonStates[2]
        ) {
            Text(text = "init $clickcount")
        }
        Button(
            onClick = {
                clickcount *= 2
                sharedPref?.edit {
                    putInt("lastCount", clickcount)
                }
                localDateTime = LocalDateTime.now()
            },
            enabled = buttonStates[3]
        ) {
            Text(text = "double $clickcount")
        }
        Button(
            onClick = {
                clickcount /= 2
                sharedPref?.edit {
                    putInt("lastCount", clickcount)
                }
                localDateTime = LocalDateTime.now()
            },
            enabled = buttonStates[4]
        ) {
            Text(text = "split $clickcount")
        }

        Text(text = "Last Button clicked at $localDateTime")

        Button(
            onClick = {
                sharedPref?.edit {
                    putInt("snapshotCount", clickcount)
                }
                localDateTime = LocalDateTime.now()
            }) {
            Text(text = "save $clickcount")
        }
        Button(
            onClick = {
                val temp = clickcount
                clickcount = snapshotCount
                snapshotCount = temp
                sharedPref?.edit {
                    putInt("lastCount", clickcount)
                    putInt("snapshotCount", snapshotCount)
                }
                localDateTime = LocalDateTime.now()
            }
        ) {
            Text(text = "swap with snapshot $snapshotCount")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    Counter_0521Theme {
        MainScreen(
            "Android"
        )
    }
}
