/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package kt.guide

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    for (i in 1..2) {   
        println(App().greeting)
    }
    1.toDouble()

}