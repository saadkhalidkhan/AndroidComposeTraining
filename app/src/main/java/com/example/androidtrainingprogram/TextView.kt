package com.example.androidtrainingprogram

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TextView(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 14.sp,
    textAlign: TextAlign = TextAlign.Start,
    textColor: Color = MaterialTheme.colors.primary,
    textDecoration: TextDecoration = TextDecoration.None,
    textStyle: TextStyle = MaterialTheme.typography.body1,
    fontWeight: FontWeight = FontWeight.Bold,
    fontStyle: FontStyle = FontStyle.Normal

) {
    Text(
        modifier = modifier,
        text = text,
        style = textStyle.copy(
            color = textColor,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontStyle = fontStyle
        ),
        textAlign = textAlign,
        textDecoration = textDecoration,
    )
}
