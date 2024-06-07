import kotlinx.coroutines.*

suspend fun main() {
    coroutineScope {
        val job1 = launch {
        for (x in 1..5) {
            delay(1000L)
            println(x)}
        }

        val job2 = launch {
        for (x in 1..5) {
            delay(1000L)
            println(x)}
        }

        job1.join()
        job2.join()
    }

    println("Hello, world!")
}
