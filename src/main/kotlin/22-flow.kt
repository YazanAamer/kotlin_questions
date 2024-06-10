import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun myFlow(): Flow<Int> = flow {
    for (i in 1..5) {
        delay(500)
        emit(i)
    }
}

fun main() {
    runBlocking {
        launch {
            myFlow().collect { value -> println(value)}
        }
    }
}