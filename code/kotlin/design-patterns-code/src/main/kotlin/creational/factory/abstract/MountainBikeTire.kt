package creational.factory.abstract

class MountainBikeTire : Tire() {
    override val description: Unit
        get() {
            println("Mountain bike tire. Width: " + width + ", pressure: " + pressure)
        }

    companion object {
        private const val width = "WIDE"
        private const val pressure = "MEDIUM"
    }
}