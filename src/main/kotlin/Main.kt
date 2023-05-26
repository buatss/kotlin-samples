data class Person(
    val name: String,
    val age: Int? = null
)

fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
}

fun main(args: Array<String>) {
    val persons = listOf(
        Person("Alicja"),
        Person("Bartek", age = 29)
    )
    val oldest = persons.maxBy { it.age ?: 0 }
    println("Najstarsza osoba: $oldest")

    val max = max(3, 5)
    println("Max 3 i 5: $max")
}
