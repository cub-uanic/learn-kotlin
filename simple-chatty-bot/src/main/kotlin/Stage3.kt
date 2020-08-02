// https://hyperskill.org/projects/95/stages/526

package bot

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, " + name + "!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105

    println("Your age is " + age + "; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")

    val count = scanner.nextInt()
    for (idx in 0..count) {
        println("${idx}!")
    }

    println("Completed, have a nice day!")
}
