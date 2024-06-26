package ru.netology.statsview.utils

import android.content.Context
import java.math.BigDecimal
import kotlin.math.ceil


object AndroidUtils {
    fun dp(context: Context, dp: Float): Int =
        ceil(context.resources.displayMetrics.density * dp).toInt()

    fun percentage(list: List<Float>): List<Float> {
        val sum = (list.sum())  //2000
        return list.map { it / sum } //0,25
    }
}
