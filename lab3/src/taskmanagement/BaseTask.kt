package taskmanagement

abstract class BaseTask(
    override val id: Int,
    final override val title: String,
    override var status: TaskStatus = TaskStatus.TO_DO,
    override var priority: TaskPriority = TaskPriority.MEDIUM
) : Task {
    init {
        require(title.isNotBlank()) { "Title cannot be blank" }
    }

    override fun getDetails(): String {
        return "Task #$id: $title\nStatus: $status\nPriority: $priority"
    }

    override fun updateStatus(newStatus: TaskStatus) {
        status = newStatus
    }

    override fun updatePriority(newPriority: TaskPriority) {
        priority = newPriority
    }
}