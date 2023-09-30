package com.example.androidtrainingprogram

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import coil.compose.AsyncImage
import com.example.androidtrainingprogram.ui.theme.AndroidTrainingProgramTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidTrainingProgramTheme {
                MyProfileScreen()
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyProfileScreen() {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringResource(R.string.profile),
                        style = MaterialTheme.typography.body1,
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {

                    }) {
                        Icon(Icons.Rounded.KeyboardArrowLeft, "", tint = Color.White)
                    }
                },
                backgroundColor = Color(0xFF9470CE),
                actions = {
                    IconButton(onClick = {
                    }) {
                        Icon(
                            Icons.Filled.Menu,
                            contentDescription = stringResource(R.string.menu_icon),
                            tint = Color.White
                        )
                    }
                }
            )
        },
    ) {

        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFCCC2DC))

        ) {
            val (curveBackground, card1View, card2View, card3View, card4View, userProfilePicture) = createRefs()

            //-: Used for background curve
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .background(
                        color = Color(0xFF9470CE),
                        shape = RoundedCornerShape(
                            topStart = 0.dp,
                            topEnd = 0.dp,
                            bottomStart = 200.dp,
                            bottomEnd = 200.dp
                        )
                    )
                    .constrainAs(curveBackground) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints
                        height = Dimension.wrapContent
                    }
            ) {

            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 100.dp)
                    .constrainAs(card1View) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints
                        height = Dimension.wrapContent
                    },
                backgroundColor = Color.White,
                elevation = 6.dp,
                shape = RoundedCornerShape(4.dp)
            ) {
                ConstraintLayout(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp)
                ) {
                    val (userNameText, userLocationText, followButton) = createRefs()

                    Text(
                        modifier = Modifier
                            .constrainAs(userNameText) {
                                top.linkTo(parent.top)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                                width = Dimension.wrapContent
                                height = Dimension.wrapContent
                            }
                            .padding(top = 40.dp),
                        text = stringResource(R.string.user_name),
                        style = MaterialTheme.typography.h4.copy(
                            color = Color.Black,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        modifier = Modifier
                            .constrainAs(userLocationText) {
                                top.linkTo(userNameText.bottom)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                                width = Dimension.wrapContent
                                height = Dimension.wrapContent
                            },
                        text = stringResource(R.string.user_location),
                        style = MaterialTheme.typography.body1.copy(
                            color = Color.White,
                            fontSize = 12.sp,
                        ),
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Button(
                        modifier = Modifier
                            .padding(
                                top = 20.dp,
                                bottom = 15.dp
                            )
                            .height(40.dp)
                            .width(150.dp)
                            .constrainAs(followButton) {
                                top.linkTo(userLocationText.bottom)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                                bottom.linkTo(parent.bottom)
                                width = Dimension.wrapContent
                                height = Dimension.wrapContent
                            },
                        onClick = {},
                        enabled = true,
                        shape = RoundedCornerShape(50.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF9470CE))

                    ) {
                        Text(
                            text = stringResource(R.string.follow),
                            style = MaterialTheme.typography.body1.copy(color = Color.White)
                        )
                    }
                }

            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 28.dp)
                    .constrainAs(card2View) {
                        top.linkTo(card1View.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints
                        height = Dimension.wrapContent
                    },
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
                            text = stringResource(R.string._224),
                            style = MaterialTheme.typography.h4.copy(
                                color = Color.Black,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(
                            text = stringResource(R.string.following),
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
                            text = stringResource(R.string._48_6_k),
                            style = MaterialTheme.typography.h4.copy(
                                color = Color.Black,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(
                            text = stringResource(R.string.followers),
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
                            text = stringResource(R.string._3_2_m),
                            style = MaterialTheme.typography.h4.copy(
                                color = Color.Black,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(
                            text = stringResource(R.string.like),
                            style = MaterialTheme.typography.body1.copy(
                                color = Color.White,
                                fontSize = 12.sp,
                            ),
                            color = Color.Gray
                        )
                    }
                }

            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 28.dp)
                    .constrainAs(card3View) {
                        top.linkTo(card2View.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints
                        height = Dimension.wrapContent
                    },
                elevation = 6.dp,
                backgroundColor = Color.White,
                shape = RoundedCornerShape(4.dp)
            ) {
                ConstraintLayout(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 16.dp)
                ) {
                    val (friendsText, seeAllText, friendsList) = createRefs()
                    Text(
                        modifier = Modifier.constrainAs(friendsText) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                            width = Dimension.wrapContent
                            height = Dimension.wrapContent
                        },
                        text = stringResource(R.string.friends),
                        style = MaterialTheme.typography.body1.copy(
                            color = Color.Black,
                            fontSize = 12.sp,
                        )
                    )
                    Text(
                        modifier = Modifier.constrainAs(seeAllText) {
                            top.linkTo(parent.top)
                            end.linkTo(parent.end)
                            width = Dimension.wrapContent
                            height = Dimension.wrapContent
                        },
                        text = stringResource(R.string.see_all),
                        style = MaterialTheme.typography.body1.copy(
                            color = Color.White,
                            fontSize = 12.sp,
                        ),
                        color = Color.Gray
                    )
                    LazyRow(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .constrainAs(friendsList) {
                                start.linkTo(friendsText.start)
                                end.linkTo(seeAllText.end)
                                top.linkTo(friendsText.bottom)
                                bottom.linkTo(parent.bottom)
                                width = Dimension.fillToConstraints
                            },
                        state = rememberLazyListState(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        items(12) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.ic_user_profile),
                                    contentDescription = stringResource(R.string.avatar),
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(60.dp)
                                        .clip(CircleShape)
                                        .border(
                                            1.dp,
                                            Color.Gray,
                                            CircleShape
                                        )
                                )
                                Text(
                                    text = stringResource(R.string.saad),
                                    style = MaterialTheme.typography.body1.copy(
                                        color = Color.White,
                                        fontSize = 12.sp,
                                    ),
                                    color = Color.Gray
                                )
                            }
                        }
                    }
                }


            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 28.dp)
                    .constrainAs(card4View) {
                        top.linkTo(card3View.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints
                        height = Dimension.wrapContent
                    },
                elevation = 6.dp,
                backgroundColor = Color.White,
                shape = RoundedCornerShape(4.dp)
            ) {
                ConstraintLayout(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 16.dp)
                ) {
                    val (photosText, gridList) = createRefs()
                    Text(
                        modifier = Modifier.constrainAs(photosText) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                            width = Dimension.wrapContent
                            height = Dimension.wrapContent
                        },
                        text = stringResource(R.string.photos),
                        style = MaterialTheme.typography.body1.copy(
                            color = Color.Black,
                            fontSize = 12.sp,
                        )
                    )

                    LazyVerticalStaggeredGrid(
                        modifier = Modifier
                            .constrainAs(gridList) {
                                top.linkTo(photosText.bottom)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                                width = Dimension.fillToConstraints
                            }
                            .padding(top = 10.dp),
                        columns = StaggeredGridCells.Fixed(2),
                        verticalItemSpacing = 4.dp,
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        content = {
                            items(randomSizedPhotos.size) { index ->
                                var loaded by remember {
                                    mutableStateOf(false)
                                }
                                AsyncImage(
                                    model = randomSizedPhotos[index],
                                    contentDescription = "Coil ",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentHeight(),
                                    placeholder = painterResource(id = R.drawable.ic_user_profile),
                                    error = painterResource(id = R.drawable.ic_user_profile),
                                    fallback = painterResource(id = R.drawable.ic_user_profile),
                                    onSuccess = {
                                        loaded = true
                                    },
                                    colorFilter = if (!loaded) ColorFilter.tint(
                                        LocalContentColor.current
                                    ) else null
                                )
                            }
                        },
                    )
                }


            }
            Image(
                painter = painterResource(R.drawable.ic_user_profile),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(top = 60.dp)
                    .size(70.dp)
                    .clip(CircleShape)
                    .border(
                        1.dp,
                        Color.Gray,
                        CircleShape
                    )
                    .constrainAs(userProfilePicture) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        width = Dimension.wrapContent
                        height = Dimension.wrapContent
                    }
            )
        }


    }
}

private val rangeForRandom = (0..100000)

fun randomSampleImageUrl(
    seed: Int = rangeForRandom.random(),
    width: Int = 300,
    height: Int = width,
): String {
    return "https://picsum.photos/seed/$seed/$width/$height"
}

val randomSizedPhotos = listOf(
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 900, height = 1600),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 300, height = 400),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 900, height = 1600),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 300, height = 400),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 900, height = 1600),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 300, height = 400),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 300, height = 400),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 900, height = 1600),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 300, height = 400),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 500, height = 500),
)

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    AndroidTrainingProgramTheme {
        MyProfileScreen()
    }
}