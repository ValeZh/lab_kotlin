
fun countUniqueNames(names: Array<String?>): Int {
    val uniqueNames = names.filterNotNull().toSet()
    return uniqueNames.size
}

fun main() {
    val names = arrayOf("Alice", "Bob", null, "Alice", "Eve", null, "Bob")
    val uniqueCount = countUniqueNames(names)
    println("Кількість унікальних не-null імен: $uniqueCount")
}