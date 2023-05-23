package com.sample.character.view

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SimpsonsDetailFragmentArgs(
  public val itemId: String = ""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("item_id", this.itemId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SimpsonsDetailFragmentArgs {
      bundle.setClassLoader(SimpsonsDetailFragmentArgs::class.java.classLoader)
      val __itemId : String?
      if (bundle.containsKey("item_id")) {
        __itemId = bundle.getString("item_id")
        if (__itemId == null) {
          throw IllegalArgumentException("Argument \"item_id\" is marked as non-null but was passed a null value.")
        }
      } else {
        __itemId = ""
      }
      return SimpsonsDetailFragmentArgs(__itemId)
    }
  }
}
