abstract class AbstractDungeonMaster {

	abstract val gameName: String

	fun startGame() {
		println("Game $gameName started")
	}
}

interface Dragon

interface Greeter {

	fun sayHello() {
		println("Hello")
	}
}

class DungeonMaster: Greeter, AbstractDungeonMaster() {
	override val gameName: String
		get() = "DungeonMaster gameName function implementation"
}

fun main(args: Array<String>)  {
	val dungeonMaster = DungeonMaster()
	dungeonMaster.startGame()
	println(dungeonMaster.gameName)
	dungeonMaster.sayHello()
}
