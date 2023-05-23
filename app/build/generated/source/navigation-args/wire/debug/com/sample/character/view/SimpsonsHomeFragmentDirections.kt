package com.sample.character.view

import android.os.Bundle
import androidx.navigation.NavDirections
import com.sample.character.R
import kotlin.Int
import kotlin.String

public class SimpsonsHomeFragmentDirections private constructor() {
  private data class ActionSimpsonsHomeFragmentToSimpsonsDetailFragment(
    public val itemId: String = ""
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_simpsonsHomeFragment_to_simpsonsDetailFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("item_id", this.itemId)
      return result
    }
  }

  public companion object {
    public fun actionSimpsonsHomeFragmentToSimpsonsDetailFragment(itemId: String = ""):
        NavDirections = ActionSimpsonsHomeFragmentToSimpsonsDetailFragment(itemId)
  }
}
