package properties

class Person {
	var name: String = ""

	set(name) {
		field = name.toUpperCase()
	}
}

fun main() {
	val person = Person()
	person.name = "lower_case_name"
	println("person.name: ${person.name}")
}
