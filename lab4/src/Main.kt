
fun main() {
    val numbers = listOf(1, 2, 3, 4, 8, 10, 16, 18, 32, 33)
    val powersOfTwo = numbers.filter { it > 0 && (it and (it - 1)) == 0 }
    println(powersOfTwo) 
}