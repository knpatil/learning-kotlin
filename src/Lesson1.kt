fun main() {
    print("Hello, ") // print without a new line
    println(" World") // with a new line

    // String
    val name = "Johnny"
    println(name.toUpperCase())

    var x = 1 // variable
    // while loop
    while (x < 10) {
        println("x is $x")
        x++;
    }

    val y = 100 // this is constant, can't change the value

    // for loop
    for (i in 1..10) {
        println("i is $i")
    }

    // if .. else statement
    if (x > y) {
        println("x ($x) is greater than y ($y)")
    } else {
        println("y ($y) is greater than x ($x)")
    }

    // if expression
    println(if (x > y) "x ($x) is greater than y ($y)" else "x ($x) is greater than y ($y)")
}

/*

Getting Started with Kotlin:

use fun to define a function

there must a function called main in every application

// for comment

String is a sequence of chars, enclosed in a double quotes

{ }  for code blocks

; a the end of the statement is optional

operators: = == < > <= >=

var to define a variable whose value can change

val to define a constant, compile error if try to change

loops: while, for, do .. while

if else for conditionals

if can be used as an expression, in this case else cause is mandatory

 */