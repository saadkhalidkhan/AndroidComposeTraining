package com.example.androidtrainingprogram

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidtrainingprogram.ui.theme.AndroidTrainingProgramTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidTrainingProgramTheme {
                MyCVScreen()
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyCVScreen() {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Profile",
                        style = MaterialTheme.typography.body1,
                        textAlign = TextAlign.Center
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {

                    }) {
                        Icon(Icons.Rounded.KeyboardArrowLeft, "")
                    }
                },
                actions = {
                    IconButton(onClick = {
                    }) {
                        Icon(
                            Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                }
            )
        },
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFFCCC2DC))
            ) {

                Spacer(modifier = Modifier.height(100.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    backgroundColor = Color.White,
                    elevation = 6.dp,
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Spacer(modifier = Modifier.height(50.dp))
                        Text(
                            "Saad Khan",
                            style = MaterialTheme.typography.h4.copy(
                                color = Color.Black,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(
                            "Johar Town",
                            style = MaterialTheme.typography.body1.copy(
                                color = Color.White,
                                fontSize = 12.sp,
                            ),
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Button(
                            modifier = Modifier
                                .height(40.dp)
                                .width(150.dp),
                            onClick = {},
                            enabled = true,
                            shape = RoundedCornerShape(50.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)

                        ) {
                            Text(
                                text = "FOLLOW",
                                style = MaterialTheme.typography.body1.copy(color = Color.White)
                            )
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                    }

                }
                Spacer(modifier = Modifier.height(28.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    elevation = 6.dp,
                    backgroundColor = Color.White,
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(70.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .weight(1f),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                "224",
                                style = MaterialTheme.typography.h4.copy(
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                            Text(
                                "Following",
                                style = MaterialTheme.typography.body1.copy(
                                    color = Color.White,
                                    fontSize = 12.sp,
                                ),
                                color = Color.Gray
                            )
                        }
                        Divider(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(1.dp)
                                .padding(vertical = 16.dp),
                            color = Color.Gray,
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .weight(1f),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                "48.6 K",
                                style = MaterialTheme.typography.h4.copy(
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                            Text(
                                "Followers",
                                style = MaterialTheme.typography.body1.copy(
                                    color = Color.White,
                                    fontSize = 12.sp,
                                ),
                                color = Color.Gray
                            )
                        }
                        Divider(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(1.dp)
                                .padding(vertical = 16.dp),
                            color = Color.Gray,
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .weight(1f),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                "3.2 M",
                                style = MaterialTheme.typography.h4.copy(
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                            Text(
                                "Like",
                                style = MaterialTheme.typography.body1.copy(
                                    color = Color.White,
                                    fontSize = 12.sp,
                                ),
                                color = Color.Gray
                            )
                        }
                    }

                }
                Spacer(modifier = Modifier.height(28.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    elevation = 6.dp,
                    backgroundColor = Color.White,
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 16.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                "Friends",
                                style = MaterialTheme.typography.body1.copy(
                                    color = Color.Black,
                                    fontSize = 12.sp,
                                )
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            Text(
                                "SEE ALL",
                                style = MaterialTheme.typography.body1.copy(
                                    color = Color.White,
                                    fontSize = 12.sp,
                                ),
                                color = Color.Gray
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(70.dp)
                        ) {
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.ic_user_profile),
                                    contentDescription = "avatar",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                        .border(
                                            1.dp,
                                            Color.Gray,
                                            CircleShape
                                        )
                                )
                                Text(
                                    "Saad",
                                    style = MaterialTheme.typography.body1.copy(
                                        color = Color.White,
                                        fontSize = 12.sp,
                                    ),
                                    color = Color.Gray
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.ic_user_profile),
                                    contentDescription = "avatar",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                        .border(
                                            1.dp,
                                            Color.Gray,
                                            CircleShape
                                        )
                                )
                                Text(
                                    "Saad",
                                    style = MaterialTheme.typography.body1.copy(
                                        color = Color.White,
                                        fontSize = 12.sp,
                                    ),
                                    color = Color.Gray
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.ic_user_profile),
                                    contentDescription = "avatar",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                        .border(
                                            1.dp,
                                            Color.Gray,
                                            CircleShape
                                        )
                                )
                                Text(
                                    "Saad",
                                    style = MaterialTheme.typography.body1.copy(
                                        color = Color.White,
                                        fontSize = 12.sp,
                                    ),
                                    color = Color.Gray
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.ic_user_profile),
                                    contentDescription = "avatar",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                        .border(
                                            1.dp,
                                            Color.Gray,
                                            CircleShape
                                        )
                                )
                                Text(
                                    "Saad",
                                    style = MaterialTheme.typography.body1.copy(
                                        color = Color.White,
                                        fontSize = 12.sp,
                                    ),
                                    color = Color.Gray
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.ic_user_profile),
                                    contentDescription = "avatar",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                        .border(
                                            1.dp,
                                            Color.Gray,
                                            CircleShape
                                        )
                                )
                                Text(
                                    "Saad",
                                    style = MaterialTheme.typography.body1.copy(
                                        color = Color.White,
                                        fontSize = 12.sp,
                                    ),
                                    color = Color.Gray
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                        }
                    }

                }
            }

            Image(
                painter = painterResource(R.drawable.ic_user_profile),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(top = 60.dp)
                    .align(Alignment.TopCenter)
                    .size(70.dp)
                    .clip(CircleShape)
                    .border(
                        1.dp,
                        Color.Gray,
                        CircleShape
                    )
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    AndroidTrainingProgramTheme {
        MyCVScreen()
    }
}