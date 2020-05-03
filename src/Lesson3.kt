/** Functions in Kotlin */

/**

Functions are useful for organizing the code and to make it more reusable.

Function can have parameters, so you can pass value/values to it.

The number and type of values you pass to the function must match
the order and type of the parameters declared by the function.

A function can return a value. You must define the type of value it returns.

A Unit return type means that the function does not return anything.

For loops are more better if you know how many times you want to repeat the loop code.

The readLine() function reads a line of input from the standard input stream.
It returns a String value which is a text entered by the user.

null means it has no value, or it is missing.

Logical operators in Kotlin:
&& means and, || means or, ! means not
 */

fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val machineChoice = getMachineChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, machineChoice)
}

fun getMachineChoice(options: Array<String>) = options[(Math.random() * options.size).toInt()]

fun getUserChoice(options: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        print("Please enter your choice from:")
        for (item in options) print(" $item")
        println(".")

        val userInput = readLine()
        if (userInput != null && userInput in options) {
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println("Enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, machineChoice: String) {
    val result: String =
        if (userChoice == machineChoice)
            "Tie!"
        else if ((userChoice == "Rock" && machineChoice == "Scissors") ||
            (userChoice == "Paper" && machineChoice == "Rock") ||
            (userChoice == "Scissors" && machineChoice == "Paper")
        )
            "You win!"
        else
            "You lose!"

    println("You chose $userChoice. I chose $machineChoice. $result")
}