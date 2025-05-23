package App.howmuchsix.ui.blocks

import App.howmuchsix.hms.Blocks.Block
import App.howmuchsix.hms.Blocks.PrintBlock
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class PrintBlockUI : BlockUI() {
    override fun metamorphosis(params: HashMap<String, Any>): Block {
        val output = params["output"]?.let {
            when (it) {
                is String -> it
                else -> it.toString()
            }
        } ?: throw IllegalArgumentException("Output parameter is required")
        return PrintBlock(output)
    }

    @Composable
    override fun Render(modifier: Modifier) {
        TODO("Not yet implemented")
    }
}