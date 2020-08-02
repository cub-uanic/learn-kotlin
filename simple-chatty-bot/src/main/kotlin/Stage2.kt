// https://hyperskill.org/projects/95/stages/525

package bot

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val yourName = scanner.next()

    println("What a great name you have, ${yourName}!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val remainder3 = scanner.nextInt()
    val remainder5 = scanner.nextInt()
    val remainder7 = scanner.nextInt()

    val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    println("Your age is ${yourAge}; that's a good time to start programming!")
}
