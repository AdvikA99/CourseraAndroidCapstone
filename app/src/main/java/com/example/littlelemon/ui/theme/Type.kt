package com.example.littlelemon.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.littlelemon.R

val Markazi = FontFamily(
    Font(R.font.markazi_regular),
    Font(R.font.markazi_bold, FontWeight.Bold)
)

val Karla = FontFamily(
    Font(R.font.karla_regular),
    Font(R.font.karla_bold, FontWeight.Bold)
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Markazi,
        fontSize = 42.sp
    ),
    h2 = TextStyle(
        fontFamily = Markazi,
        fontSize = 32.sp
    ),
    h3 = TextStyle(
        fontFamily = Karla,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    body1 = TextStyle(
        fontFamily = Karla,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = Karla,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp
    ),
    h4 = TextStyle(
        fontFamily = Karla,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
)
