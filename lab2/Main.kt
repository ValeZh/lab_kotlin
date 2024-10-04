//Створіть локальну функцію в функції-розширення для
//роботи з рядками, яка перевіряє, чи є рядок паліндромом.
fun main() {

    fun String.palindromTest(): Boolean {

        if(this.reversed() == this)
        {
            return true
        }
        return false
    }

    var palindrome = "deed"
    println(palindrome.palindromTest())
    palindrome = "color"
    println(palindrome.palindromTest())
}