package com.example.a200368_hakimi_hussein_lab4.data

import com.example.a200368_hakimi_hussein_lab4.R

/**
 * Datasource for the cupcake app.
 */
object DataSource {
    val flavors = listOf(
        R.string.vanilla,
        R.string.chocolate,
        R.string.red_velvet,
        R.string.salted_caramel,
        R.string.coffee
    )

    val quantityOptions = listOf(
        Pair(R.string.one_cupcake, 1),
        Pair(R.string.six_cupcakes, 6),
        Pair(R.string.twelve_cupcakes, 12)
    )
}
