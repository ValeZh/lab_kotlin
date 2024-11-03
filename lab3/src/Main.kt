package taskmanagement

fun main() {
    val bug = Bug(1, "Fix login bug", "High")
    val feature = Feature(2, "Add new payment method", "Implement PayPal integration")
    val enhancement = Enhancement(3, "Optimize database queries", "Improves performance by 20%")

    println(bug.getDetails())
    bug.updateStatus(TaskStatus.IN_PROGRESS)
    println("\nUpdated status:")
    println(bug.getDetails())

    println("\n" + feature.getDetails())
    feature.updatePriority(TaskPriority.HIGH)
    println("\nUpdated priority:")
    println(feature.getDetails())

    println("\n" + enhancement.getDetails())
    enhancement.updateStatus(TaskStatus.DONE)
    println("\nUpdated status:")
    println(enhancement.getDetails())
}
