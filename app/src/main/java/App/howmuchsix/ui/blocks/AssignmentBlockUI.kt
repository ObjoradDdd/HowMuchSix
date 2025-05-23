package App.howmuchsix.ui.blocks

import App.howmuchsix.hms.Blocks.AssignmentBlock
import App.howmuchsix.hms.Blocks.Block
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class AssignmentBlockUI : BlockUI() {
    override fun metamorphosis(params: HashMap<String, Any>): Block {

        val variable = params["variable"] as? String
            ?: throw IllegalArgumentException("Variable name parameter is required")

        val value = params["value"]?.let {
            when (it) {
                is String -> it
                else -> it.toString()
            }
        } ?: throw IllegalArgumentException("Value parameter is required")

        return AssignmentBlock(variable, value)
    }

    @Composable
    override fun Render(modifier: Modifier) {
        TODO("Not yet implemented")
    }
}