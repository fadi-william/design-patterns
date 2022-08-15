package creational.factory.abstract

class RoadBikeHandlebar : Handlebar() {
    override val description: Unit
        get() {
            println("Road bike handlebar. Type: " + type)
        }

    companion object {
        private const val type = "DROP"
    }
}