package com.example.newsapplication

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.text.HtmlCompat
import androidx.compose.foundation.layout.Box as Box2
import androidx.compose.material.MaterialTheme.colors as colors1
import androidx.compose.material.Surface as Surface1

class DisplayNews : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainPage.NewsHeadlinesTheme {
                // A surface container using the 'background' color from the theme
                Box2 {
                    Box2 {
                        Surface1(
                            Modifier.fillMaxSize(), color = colors1.background

                        ) {

                            var desk = getIntent().getStringExtra("desk")
                            var title = getIntent().getStringExtra("title")
                            var uriImage = getIntent().getStringExtra("urlToImage")
                            Log.i("test123abc", "MovieItem: $desk")

                            Column(
                                Modifier
                                    .background(Color.Gray)
                                    .padding(20.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = "" + title, fontSize = 32.sp)
                                HtmlText(html = desk.toString())
                                /*  AsyncImage(
                                      model = "https://example.com/image.jpg",
                                      contentDescription = "Translated description of what the image contains"
                                  )*/
                                val rememberImagePainter = rememberImagePainter(uriImage)
                                Image(
                                    androidx.compose.foundation.layout.Box {
                                        rememberImagePainter
                                    }, "My content description",
                                )
                            }
                            //   Greeting(desk.toString())
                        }
                    }
                }
            }
        }
    }

    private fun Image(box: Unit, s: String) {

    }
}

@Composable
fun Greeting(name: String): Unit = // Text(text = "Hello $name!")
    Unit

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MainPage.NewsHeadlinesTheme {
        //   Greeting("Android")
    }
}
@Composable
fun HtmlText(html: String, modifier: Modifier = Modifier) {
    AndroidView(
        modifier = modifier,
        factory = { context -> TextView(context) },
        update = { it.text = HtmlCompat.fromHtml(html, HtmlCompat.FROM_HTML_MODE_COMPACT) }
    )
}