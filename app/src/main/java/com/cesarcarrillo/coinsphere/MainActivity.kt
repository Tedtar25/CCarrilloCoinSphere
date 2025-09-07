package com.cesarcarrillo.coinsphere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cesarcarrillo.coinsphere.ui.theme.CoinSphereTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            app()
        }
    }
}

@Preview
@Composable
fun app() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1A1D2E))
    ) {
        item {
            Text(
                text = "CoinSphere",
                fontSize = 5.sp,
                color = Color.White
            )

        }

        item() {
            Text(
                text = "Global Market Cap",
                fontSize = 3.sp,
                color = Color.Gray,
                modifier = Modifier.padding(12.dp)
            )

            Text(
                text = "$1.82T",
                fontSize = 5.sp,
                color = Color.White
                //modifier = Modifier.padding(5.dp)
            )
        }
        
        item {
            Text(
                text = "Fear & Greed",
                fontSize = 3.sp,
                color = Color.Gray,
                modifier = Modifier.padding(12.dp)
            )

            Text(
                text = "Neutral (54)",
                fontSize = 5.sp,
                color = Color.White
            )
        }

        item {
            Text(
                text = "Altcoin Season",
                fontSize = 3.sp,
                color = Color.Gray,
                modifier = Modifier.padding(12.dp)
            )

            Text(
                text = "No",
                fontSize = 5.sp,
                color = Color.White
                //modifier = Modifier.padding(5.dp)
            )
        }

        item {
            LazyRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            ) {
                item {
                    Text(
                        text = "#    Name",
                        fontSize = 3.sp,
                        color = Color.Gray
                    )
                }

                item {
                    Text(
                        text = "Price",
                        fontSize = 3.sp,
                        color = Color.Gray
                    )
                }

            }
        }

    }


}