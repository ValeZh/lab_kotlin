package taskmanagement

interface Task {
    val id: Int
    val title: String
    var status: TaskStatus
    var priority: TaskPriority

    fun getDetails(): String
    fun updateStatus(newStatus: TaskStatus)
    fun updatePriority(newPriority: TaskPriority)
}

enum class TaskStatus {
    TO_DO, IN_PROGRESS, DONE, CANCELLED
}

enum class TaskPriority {
    LOW, MEDIUM, HIGH
}