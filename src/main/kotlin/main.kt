import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.*
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.input.key.shortcuts

@OptIn(ExperimentalKeyInput::class)
fun main() = Window(title = "MRS-compose-launcher", size = IntSize(1280, 720)) {
    MaterialTheme {
        var consumedText by remember { mutableStateOf(0) }
        var text by remember { mutableStateOf("") }
        var text2 by remember { mutableStateOf("") }
        Column(Modifier.fillMaxSize(), Arrangement.spacedBy(7.dp)) {
            Text("Test Text")
            TextField(
                value = text,
                onValueChange = { text = it },
            )
            Text("Test Text2")
            TextField(
                value = text2,
                onValueChange = { text2 = it },
            )
        }
    }
}