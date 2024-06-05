import kotlinx.coroutines.*

 suspend fun main() {
    val job = GlobalScope.launch (){
        for (x in 1..5) {
            delay(1000L)
            println(x)
        }
    }
    println("Hello, world!")
    job.join()
 }