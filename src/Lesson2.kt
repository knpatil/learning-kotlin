/*

types and variables
    all code depends on variables !
    variable: is like a cup, it holds something inside it
    in Kotlin, variable holds a reference to the object. hence everything is an object in kotlin. there are no primitives

    Kotlin compiler infers the data type automatically, if value is assigned in the declaration
*/

fun main() {

    var x = 5 // declare variable and assign value, type will be inferred at Int
    // value is transformed into an object
    x += 2    // value can be changed
    println("x is $x")

    val y =
        10 // declare a constant with a value 10, reference to the object stays in the variable forever and can't be replaced
    // y +=2   // compiler error !

    /** Basic data types: Integers, Floats, Booleans, Characters, Strings */

    /** Integers: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit) */
    var z = 100 // by default, kotlin will infer this as Int

    var bigNumber = 2L // Long value

    var a = 0b10 // binary number with prefix 0b
    var b = 0xAB // hexadecimal number with prefix 0x
    // octal numbers are not supported in kotlin

    /** Floating point numbers: Float (32 bit), Double (64 bit) */
    var c = 123.45 // by default, kotlin will infer this to Double
    var d = 45.12F // explicit Float
    var isRaining2: Boolean = true
    var floatValue: Float = 3.14F
    var doubleValue: Double = 87234.1234
    var lett3er: Char = 'A'

    var name1 = "David"
    var fullName = "John Smith"

    var i = 1234567890123 // this is Long object
    var j: Int = i.toInt() // value will be converted to Int by using conversion function, but it will be truncated. You may not want this behavior in your code.


    // explicitly create a String object
    var schoolName: String = "Stanford University"

    /** Booleans : true or false */
    var isHot = true
    var isRaining = false

    /** Character and Strings */
    var letter = 'D'  // Char for single character
    var name = "Adam" // String: multiple characters together

    /** Explicitly declaring a variable type */
    var num11: Short
    var num22: Int
    var num23: Long
    var num4: Byte
    var ch: Char
    var str: String

    /** Declare type and assign a value */
    var number: Short = 3
    var myName: String = "George Washington"

    /** always assign a value before use */
    var p: Int
    // var q = p + 1 // compiler error, p is not initialized

    /** This will not work */
    // var pqr: Int = 3.14

    /** Kotlin compiler will only let you assign a value, if it is compatible with variable type
     * if the value is too large or of different type, the code will not compile
     */


    /** converting values */
    var n1 = 5 // becomes Int
    var n2: Long = x.toLong() // covert using object method

    /** -------------------- */

    /** Arrays */
    var arrOfNum = arrayOf(1, 2, 3)   // array of Ints
    println(arrOfNum[1]) // prints second element
    println(arrOfNum.size)
    println("Size of the array is ${arrOfNum.size}")

    // String array
    val fruits = arrayOf("apple", "banana", "pear", "orange")
    println(fruits[0])

    /** String template */
    var word1 = "How"
    var word2 = "are"
    var word3 = "you"

    var phrase = "$word1 $word2 $word3?"
    println(phrase)
    var phrase2 = "Fruit list contains ${fruits[2]}"; // notice use of {}, to evaluate the expression
    println(phrase2)

    var size = "Fruit basket is ${if (fruits.size > 10) "Big" else "Small"}" // expression in String template
    println(size)

    /** Explicitly define arrays type */
    var byteArray: Array<Byte> = arrayOf(3, 4, 5)
    byteArray.forEach { print(" $it") }

    var intArray: Array<Int> = arrayOf(11, 22, 33)

    var cities: Array<String> = arrayOf("New York", "Denver", "Paris", "Tokyo" )
    var citySize = "cities has ${cities.size} entries."
    var firstCity = "The first entry is ${cities[0]}"



    var decimalNumbers: Array<Double> = arrayOf(3.14, 5.12, 6.23, 10.0)

    var id = 99
    var idString = "My ID is $id"

  }