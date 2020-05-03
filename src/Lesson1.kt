fun main() {
/**
    Variables are very important construct in any programming language. So, let us look at how you can use variables in Kotlin programming language.
*/
    // To declare a variable in kotlin, use following syntax:
    var x1 = 10
    val y1 = 20
/**
    When you declare a variable in kotlin using a code as mentioned above, the value is transformed into an object and reference to that object is assigned to the variable. In kotlin, variable holds a reference to an object. In the above example, as you are assigning value 10 to variable x, compiler infers that 10 is an integer hence it creates an object of type Int and stores the reference to that object in x. Similarly, reference to an Int object with value 20 is assigned to the variable y. Kotlin uses postfix syntax for type declaration.

    Variables defined with var are changeable, meaning that the object reference can be replaced or reused. They are mutable.

    Variables defined with val are non-changeable, meaning the variable holds a reference to the same object forever. You cannot assign another value to that variable. These variables are immutable.

    So, in above example, you can change the value of x, but you cannot change the value of y.

    Kotlin infers the data type based on the value assigned to the variable. Let us look at how you can explicitly define the data type of the variable.
    Basic data types in Kotlin
    Integers

    Kotlin has four basic integer types.

    Byte ( 8 bits )
    Short ( 16 bits )
    Int ( 32 bits )
    Long ( 64 bits )

    How to explicitly define variable’s type

    You can explicitly define a variable’s type by putting a colon after the variable’s name, followed by the type as shown below:

 */
    var smallNumber: Byte = 25
    var anotherSmallNum: Short = 520
    var bigNumber1: Int = 523034234
    var reallyBigNumber: Long = 8723402332133455673

    // By default, Kotlin will infer numeric value to Int type if it is within the range of Integer value. It means that the following variable will be of type Int.
    var smallerNumber = 1

    // You can assign Long value by using following syntax:
    var bigNumber = 1L

    /**
    Binary and Hexadecimal Numbers
     */

    // Prefix a number with 0b, to assign a binary number to a variable.
    var binaryNumber = 0b10110101

    // Prefix a number with 0x, to assign a hexadecimal number to a variable.
    var hexNumber = 0xABCDEF10

    // Note that octal numbers are not supported in Kotlin.

    /**
    Floating point numbers
    */

    // Float and Double are the two basic floating point types. Floats can hold 32 bits and Doubles can hold 64 bits.
    var floatValue: Float = 3.14F
    var doubleValue: Double = 87234.1234

    /**
    By default, if you assign floating point value to a variable, then it’s type will be inferred as Double. Hence, to explicitly use Float type, use F or f suffix after the value.
    Booleans
    */

    // Boolean variables can have only one of the two values, either true or false. Kotlin compiler will create a Boolean object if you declare a variable with code as follows:
    var isRainingToday = true
    var isSunny = false

    // You can explicitly define a Boolean variable as follows:
    var isRaining: Boolean = true

    /** Characters and Strings */

    // Character variables are used for single characters. Char object is created, when you assign a variable one character within a single quotes as follows:
    var letter1 = 'A'

    // Or explicitly as follows:
    var letter: Char = 'A'

    // String object is created when you assign a value which consists of multiple characters strung together in double quotes as follows:
    var name = "David"
    var fullName = "John Smith"

    // explicitly create a String object
    var schoolName: String = "Stanford University"

    /** How to convert values to another type? */

    // The Kotlin compiler will only let you assign a value to a given variable if the value and variable type are compatible. If the value is of wrong type or too large, the code will not compile.

    // Following code will not compile:
    // var x: Int = 3.14 // compile error, as x is defined as Int and 3.14 is floating point value
    // var verySmallNumber: Byte = 300 // compile error, as Byte can hold values from -128 to 127 only

    // Even assigning Int value to a Long type will result into compile error, if not explicitly converted. For example:
    // var num1: Int = 9
    // var num2: Long = num1 // this code will not compile, compiler will give error like "Type mismatch, required Long, found Int"

    // In order to convert Int value to Long type, you can use object method. Every object has state and some behavior. Every value is an object in Kotlin. Hence you call object methods on it.
    var num1: Int = 9
    var num2: Long = num1.toLong() // converts num1 to long using object method toLong()

    // Each Kotlin numeric type have the conversion functions such as: toByte(). toShort(), toInt(), toLong(), toFloat() and toDouble()

    // Watch out for overspill when you covert bigger value using conversion functions and assign it to type with lower value range.
    var i = 1234567890123 // this is Long object
    var j: Int = i.toInt() // value will be converted to Int by using conversion function, but it will be truncated. You may not want this behavior in your code.

    /** Arrays in Kotlin */

    // You can create array using arrayOf() function in Kotlin. For example:
    var arrOfNums = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println(arrOfNums[1]) // prints second element
    println(arrOfNums.size)

    val fruits = arrayOf("apple", "banana", "pear", "orange")
    println(fruits[0])

    // Kotlin infers the type of the arrays based on the values assigned. You can create an array of specific type as follows:
    var byteArray: Array<Byte> = arrayOf(1, 3, 5, 7)
    var intArray: Array<Int> = arrayOf(11, 22, 33)
    var cities2: Array<String> = arrayOf("New York", "Denver", "Paris")
    var decimalNumbers: Array<Double> = arrayOf(3.14, 5.12, 6.23, 10.0)

    /** String Templates */

    // Kotlin provides quick and easy way of referring to a variable from inside a String. In order to do that, prefix the variable with a $. For example to include the value of variable id which if of type Int inside a String, you can use following code:
    var id = 99
    var idString = "My ID is $id"

    // String templates are very powerful, you can use any expression inside a String, Kotlin compiler will interpolate the expression and assign the value to the String variable.
    var cities: Array<String> = arrayOf("New York", "Denver", "Paris")
    var citySize = "cities has ${cities.size} entries."
    var firstCity = "The first entry is ${cities[0]}"

}