interface ISubscriber {
    fun update(value: Any)
}

class Publisher(private var observableAttribute: Any) {
    private val subscribers: MutableList<ISubscriber> = mutableListOf()

    fun addSubscriber(subscriber: ISubscriber) = subscribers.add(subscriber)

    fun setAttribute(value: Any) {
        this.observableAttribute = value
        subscribers.forEach { it.update(value) }
    }
}

class PrintingSubscriber: ISubscriber {
    override fun update(value: Any) {
        println("Publisher has updated to $value!")
    }
}

fun main () {
    val publisher = Publisher(1)
    val printingSubscriber = PrintingSubscriber()
    publisher.addSubscriber(printingSubscriber)
    publisher.setAttribute(2)
}