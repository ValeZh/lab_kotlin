package taskmanagement

class Bug(
    id: Int,
    title: String,
    private val severity: String
) : BaseTask(id, title) {
    override fun getDetails(): String {
        return "${super.getDetails()}\nSeverity: $severity"
    }
}