package com.github.spike.salon.ui.hairdressers

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.spike.salon.R
import com.github.spike.salon.ui.theme.SalonTheme

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HairDressers(modifier: Modifier) {
    Row(
        modifier = modifier.padding(
            start=24.dp,
            end=32.dp
        )
    ) {
        Text(
            text = "Our Hairdressers",
            style = MaterialTheme.typography.h6,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(
            modifier = modifier
                .width(IntrinsicSize.Max)
                .weight(1f)
        )
        Card(
            modifier = modifier.size(24.dp),
            shape = CircleShape,
            elevation = 0.dp,
            onClick = {

            }
        ) {
            Image(
                painterResource(R.drawable.ic_right_arrow),
                contentDescription = "",
            )
        }
    }
    LazyRow(
        contentPadding = PaddingValues(0.dp),
        horizontalArrangement = Arrangement.spacedBy(0.dp),
        modifier = modifier.padding(start= 8.dp)
    ) {
        items(4) { currentCount ->
            RowItem(number = currentCount, modifier)
        }
    }

}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RowItem(number: Int, modifier: Modifier) {
    val avatars = arrayOf(
        R.drawable.generated_woman_face2,
        R.drawable.generated_woman_face,
        R.drawable.generated_man_face,
        R.drawable.generated_woman_face3,
    )
    Row(
        modifier = modifier.size(68.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = modifier.size(40.dp),
            shape = CircleShape,
            elevation = 2.dp,
            onClick = {

            }
            ) {
            Image(
                painterResource(avatars[number]),
                contentDescription = "",
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HairDressersPreview() {
    SalonTheme {
        HairDressers(Modifier)
    }
}

