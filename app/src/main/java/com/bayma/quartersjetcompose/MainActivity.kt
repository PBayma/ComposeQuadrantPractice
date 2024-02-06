package com.bayma.quartersjetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bayma.quartersjetcompose.ui.theme.QuartersJetComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuartersJetComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuarterComposable()
                }
            }
        }
    }
}

@Composable
fun QuarterComposable() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically
        )
        {
            ComposableCard(
                title = "Text composable",
                content = "Displays text and follows the recommended Material Design guidelines.",
                Color(0xFFEADDFF),
                Modifier.weight(1f)
            )
            ComposableCard(
                title = "Text composable",
                content = "Displays text and follows the recommended Material Design guidelines.",
                Color(0xFFD0BCFF),
                Modifier.weight(1f)
            )
        }
        Row(
            Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically
        )
        {
            ComposableCard(
                title = "Text composable",
                content = "Displays text and follows the recommended Material Design guidelines.",
                Color(0xFFB69DF8),
                Modifier.weight(1f)
            )
            ComposableCard(
                title = "Text composable",
                content = "Displays text and follows the recommended Material Design guidelines.",
                Color(0xFFF6EDFF),
                Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun ComposableCard(title: String, content: String, color: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(color)
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = content, textAlign = TextAlign.Justify)
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuartersJetComposeTheme {
        QuarterComposable()
    }
}