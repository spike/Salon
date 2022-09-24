package com.github.spike.salon.ui.topbar

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.github.spike.salon.R
import com.github.spike.salon.ui.theme.SalonTheme

@Composable
fun TopBar() {
    TopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                fontSize = 18.sp
            )
        },
        backgroundColor = colorResource(
            id = R.color.white
        ),
        contentColor = Color.White
    )
}
@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    SalonTheme {
        TopBar()
    }
}
