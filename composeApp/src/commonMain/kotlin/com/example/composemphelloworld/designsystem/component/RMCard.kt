package com.example.composemphelloworld.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.composemphelloworld.designsystem.theme.AppColors
import com.example.composemphelloworld.domain.model.Character
import io.kamel.core.Resource
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

@Composable
fun RMCard(
    character: Character
) {

    val painterResource: Resource<Painter> = asyncPainterResource(character.image)
    val shape = RoundedCornerShape(10.dp)


    Card(
        shape = shape,
        modifier = Modifier.fillMaxWidth().height(221.dp),
        backgroundColor = Color.Black
    ) {
        Box {
            KamelImage(
                painterResource,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
                onLoading = { Text(text = "Loading") },
                onFailure = { println("Error") }
            )
        }

        Column(
            modifier = Modifier.background(AppColors.TransparentBlack).padding(15.dp)
        ) {
            Text(character.name, color = Color.White)
            Text(character.originName, color = Color.White)
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(text = character.species, color = Color.White)
                Text(text = "|", color = Color.White)
                Text(text = character.gender, color = Color.White)
                Text(text = "|", color = Color.White)
                Text(text = character.status, color = Color.White)
            }
        }
    }
}