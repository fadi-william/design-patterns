package creational.factory.abstract

class RoadBikeTire : Tire() {
    override val description: Unit
        get() {
            println("Road bike tire width: " + width + ", pressure: " + pressure)
        }

    companion object {
        private const val width = "NARROW"
        private const val pressure = "HIGH"
    }
}