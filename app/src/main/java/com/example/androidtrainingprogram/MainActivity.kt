package com.example.androidtrainingprogram

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
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
    ) {
        val state = rememberScrollState()

        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .verticalScroll(state)
        ) {

            //-: user name and designation
            UserInfo()

            //-: user professional summary
            UserProfessionalSummary()

            //-: user experiences
            UserExperiences()

            //-: user skills
            UserSkills()

            //-: user languages
            UserLanguages()

            //-: user hobbies
            UserHobbies()
        }
    }
}


@Composable
fun UserInfo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {

        TextView(
            text = stringResource(id = R.string.user_name),
            modifier = Modifier.padding(vertical = 8.dp),
            fontSize = 24.sp,
            textColor = Color.Black,
            textStyle = MaterialTheme.typography.h1,
            fontWeight = FontWeight.Bold
        )

        TextView(
            text = stringResource(id = R.string.user_designation),
            fontSize = 16.sp,
            textColor = Color.Black,
            textStyle = MaterialTheme.typography.body1,
            fontWeight = FontWeight.Normal
        )

    }
}

@Composable
fun UserProfessionalSummary() {
    TextView(
        text = stringResource(id = R.string.user_professional_summary_title),
        modifier = Modifier.padding(vertical = 8.dp),
        fontSize = 24.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.h1,
        fontWeight = FontWeight.Bold,
        textDecoration = TextDecoration.Underline
    )

    TextView(
        text = stringResource(id = R.string.user_professional_summary),
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )
}

@Composable
fun UserExperiences() {
    TextView(
        text = stringResource(id = R.string.user_experience_title),
        modifier = Modifier.padding(vertical = 8.dp),
        fontSize = 24.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.h1,
        fontWeight = FontWeight.Bold,
        textDecoration = TextDecoration.Underline
    )

    TextView(
        text = stringResource(id = R.string.user_experience_company),
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )

    TextView(
        text = stringResource(id = R.string.user_experience_company_duration),
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start,
        fontStyle = FontStyle.Italic
    )

    Divider(thickness = 1.dp, color = Color.LightGray, modifier = Modifier.padding(vertical = 4.dp))

    TextView(
        text = stringResource(id = R.string.user_experience_company),
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )

    TextView(
        text = stringResource(id = R.string.user_experience_company_duration),
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start,
        fontStyle = FontStyle.Italic
    )

    Divider(thickness = 1.dp, color = Color.LightGray, modifier = Modifier.padding(vertical = 4.dp))

    TextView(
        text = stringResource(id = R.string.user_experience_company),
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )

    TextView(
        text = stringResource(id = R.string.user_experience_company_duration),
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start,
        fontStyle = FontStyle.Italic
    )

    Divider(thickness = 1.dp, color = Color.LightGray, modifier = Modifier.padding(vertical = 4.dp))

    TextView(
        text = stringResource(id = R.string.user_experience_company),
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )

    TextView(
        text = stringResource(id = R.string.user_experience_company_duration),
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start,
        fontStyle = FontStyle.Italic
    )

    Divider(thickness = 1.dp, color = Color.LightGray, modifier = Modifier.padding(vertical = 4.dp))

    TextView(
        text = stringResource(id = R.string.user_experience_company),
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )

    TextView(
        text = stringResource(id = R.string.user_experience_company_duration),
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start,
        fontStyle = FontStyle.Italic
    )

    Divider(thickness = 1.dp, color = Color.LightGray, modifier = Modifier.padding(vertical = 4.dp))
}

@Composable
fun UserSkills() {
    TextView(
        text = stringResource(id = R.string.user_skill),
        modifier = Modifier.padding(vertical = 8.dp),
        fontSize = 24.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.h1,
        fontWeight = FontWeight.Bold,
        textDecoration = TextDecoration.Underline
    )

    TextView(
        text = "\u2022 ${stringResource(id = R.string.user_skill_android)}",
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )

    TextView(
        text = "\u2022 ${stringResource(id = R.string.user_skill_kotlin)}",
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )
    TextView(
        text = "\u2022 ${stringResource(id = R.string.user_skill_java)}",
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )

    TextView(
        text = "\u2022 ${stringResource(id = R.string.user_skill_compose)}",
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )
    TextView(
        text = "\u2022 ${stringResource(id = R.string.user_skill_mvvm)}",
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )

    TextView(
        text = "\u2022 ${stringResource(id = R.string.user_skill_retrofit)}",
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )
    TextView(
        text = "\u2022 ${stringResource(id = R.string.user_skill_project_management)}",
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )

}


@Composable
fun UserLanguages() {
    TextView(
        text = stringResource(id = R.string.user_languages),
        modifier = Modifier.padding(vertical = 8.dp),
        fontSize = 24.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.h1,
        fontWeight = FontWeight.Bold,
        textDecoration = TextDecoration.Underline
    )

    TextView(
        text = "\u2022 ${stringResource(id = R.string.user_language_english)}",
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )

    TextView(
        text = "\u2022 ${stringResource(id = R.string.user_language_urdu)}",
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )
    TextView(
        text = "\u2022 ${stringResource(id = R.string.user_language_punjabi)}",
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )

}

@Composable
fun UserHobbies() {
    TextView(
        text = stringResource(id = R.string.user_hobbies),
        modifier = Modifier.padding(vertical = 8.dp),
        fontSize = 24.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.h1,
        fontWeight = FontWeight.Bold,
        textDecoration = TextDecoration.Underline
    )

    TextView(
        text = "\u2022 ${stringResource(id = R.string.user_hobbies_travelling)}",
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )

    TextView(
        text = "\u2022 ${stringResource(id = R.string.user_hobbies_video_games)}",
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )
    TextView(
        text = "\u2022 ${stringResource(id = R.string.user_hobbies_cooking)}",
        fontSize = 16.sp,
        textColor = Color.Black,
        textStyle = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Start
    )

}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    AndroidTrainingProgramTheme {
        MyCVScreen()
    }
}