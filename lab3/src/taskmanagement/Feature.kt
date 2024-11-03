package taskmanagement

class Feature(
    id: Int,
    title: String,
    private val description: String
) : BaseTask(id, title) {
    override fun getDetails(): String {
        return "${super.getDetails()}\nDescription: $description"
    }
}