package creationalpatterns

import java.util.concurrent.atomic.AtomicInteger

object CounterSingleton {

	init {
	    println("I was accessed for the first time")
	}

	private val counter = AtomicInteger(0)
	fun increment() = counter.getAndIncrement()
}

fun main() {
	for (i in 1..10) {
		println(CounterSingleton.increment())
	}
}
