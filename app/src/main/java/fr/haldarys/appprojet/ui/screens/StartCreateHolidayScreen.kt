package fr.haldarys.appprojet.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import fr.haldarys.appprojet.R

@Composable
fun StartCreateHolidayScreen(modifier: Modifier = Modifier, onNextButtonClicked : () -> Unit) {
    Column (modifier = modifier.fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Button(onClick = onNextButtonClicked) {
            Text(text = stringResource(R.string.create_holiday))
        }
    }
}