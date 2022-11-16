package nu.annat.scrollwithkeyboard

import android.content.ClipData.Item
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import nu.annat.scrollwithkeyboard.ui.theme.ScrollWithKeyboardTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
				// A surface container using the 'background' color from the theme
				Screen(items = items)
		}
	}
}

val items = listOf(
	"qxh",
	"lt",
	"epjm",
	"48",
	"4",
	"hgm",
	"pc",
	"z",
	"48",
	"j",
	"73",
	"espac",
	"tmwe",
	"6",
	"45",
	"57",
	"4",
	"ii",
	"51",
	"t"
).take(13)

@Composable
fun Greeting(name: String) {
	Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	ScrollWithKeyboardTheme {
		Greeting("Android")
	}
}


@Composable
fun Item() {
	Row(Modifier.fillMaxWidth()) {

	}
}
@Composable
fun Screen(items:List<String>) {
	var txt by remember { mutableStateOf("test") }
	MaterialTheme() {
		Column() {
			TextField(value = txt, onValueChange = {txt = it}, modifier = Modifier.fillMaxWidth())
			LazyColumn(){
				items(items){
					Text(text = it,
						Modifier
							.fillMaxWidth()
							.height(48.dp))
				}
			}
		}
	}
}

@Preview(showSystemUi = true, device = Devices.NEXUS_6)
@Composable
fun PreviewScreen() {

	Screen(items =items)
}
