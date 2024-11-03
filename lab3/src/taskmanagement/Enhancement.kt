package taskmanagement

class Enhancement(
    id: Int,
    title: String,
    private val impact: String
) : BaseTask(id, title) {
    override fun getDetails(): String {
        return "${super.getDetails()}\nImpact: $impact"
    }
}