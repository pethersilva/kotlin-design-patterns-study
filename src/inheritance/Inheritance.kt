abstract class AbstractDungeonMaster(private val gameName: String) {
	open fun startGame() {
		println("Game $gameName started")
	}
}

interface Dragon

interface Greeter {
	fun sayHello() {
		println("Hello")
	}
}

open class DungeonMaster(gameName: String): Greeter, AbstractDungeonMaster(gameName)

class EvilDungeonMaster(private val awfulGame: String) : DungeonMaster(awfulGame) {

	override fun sayHello() {
		println("Prepare to die!")
	}

	override fun startGame() {
		println("$awfulGame will be your last!")
	}
}

fun main(args: Array<String>)  {
	val dungeonMaster = DungeonMaster("Dungeon Master Game")
	dungeonMaster.startGame()
	dungeonMaster.sayHello()

	val evilDungeonMaster = EvilDungeonMaster("Evil Game")
	evilDungeonMaster.startGame()
	evilDungeonMaster.sayHello()
}
