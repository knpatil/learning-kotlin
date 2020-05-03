import java.util.*
import kotlin.math.pow

fun main() {

    println("Day of the week is ${dayOfWeek()}")

    val array = Array(7) { 1000.0.pow(it) } // initalize array here
    val sizes = arrayOf(
        "byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte"
    )
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }

    for (i in 0..100 step 7) print("$i - ")
}

fun dayOfWeek(): Int {
    return Calendar.getInstance().get(Calendar.DATE)
}
