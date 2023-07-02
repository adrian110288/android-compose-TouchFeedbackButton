package com.lesniak.touchfeedbackbutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lesniak.lib.bouncingClickable
import com.lesniak.touchfeedbackbutton.ui.theme.TouchFeedbackButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TouchFeedbackButtonTheme {
                // A surface container using the 'background' color from the theme
                Box(
                    modifier = Modifier
                        .bouncingClickable {
                            println("Clicked...")
                        }
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(Color.Black)
                ) {}
            }
        }
    }
}