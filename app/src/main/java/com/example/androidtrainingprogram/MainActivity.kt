package com.example.androidtrainingprogram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidtrainingprogram.ui.theme.AndroidTrainingProgramTheme
import com.example.androidtrainingprogram.ui.theme.Purple40
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidTrainingProgramTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val snackbarHostState = remember {
        SnackbarHostState()
    }

    val scope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Android Training Program",
                        style = MaterialTheme.typography.body1
                    )
                },
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            Icons.Filled.Favorite,
                            contentDescription = "Localized description"
                        )
                    }

                    IconButton(onClick = {
                        scope.launch {
                            snackbarHostState.showSnackbar("This is Dummy Snackbar!")
                        }
                    }) {
                        Icon(
                            Icons.Filled.Settings,
                            contentDescription = "Localized description"
                        )
                    }
                }
            )
        },
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        }
    ) {
        val state = rememberScrollState()

        Column(
            modifier = Modifier
                .padding(it)
                .verticalScroll(state)
        ) {
            /*Text(
                modifier = Modifier
                    .padding(8.dp)
                    .background(Color.Black)
                    .padding(8.dp),
                text = stringResource(id = R.string.dummy_text),
                style = MaterialTheme.typography.body1.copy(
                    color = Color.White
                )
            )*/

            Text(
                modifier = Modifier
                    .padding(8.dp)
                    .background(Color.Black, shape = RoundedCornerShape(8.dp))
                    .border(color = Color.Red, width = 1.dp, shape = RoundedCornerShape(8.dp))
                    .padding(8.dp)
                    .clickable {
                        scope.launch {
                            snackbarHostState.showSnackbar("This is Dummy Snackbar!")
                        }
                    },
                text = "Welcome",
                style = MaterialTheme.typography.body1.copy(
                    color = Color.White
                )
            )
        }
    }
}


@Composable
fun WelcomeUser(name: String) {
    Box(
        modifier = Modifier.background(Purple40)
    ) {
        Text(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .background(Color.Black)
                .padding(8.dp),
            text = "Hello $name!",
            textDecoration = TextDecoration.LineThrough,
            style = MaterialTheme.typography.body1.copy(
                color = Color.White
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeUserPreview() {
    WelcomeUser(name = "Welcome Home")
}


@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    AndroidTrainingProgramTheme {
        MainScreen()
    }
}