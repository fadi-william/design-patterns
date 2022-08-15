package creational.factory.abstract

object FactoryCreator {
    fun createFactory(type: String): BikeFactory? {
        return if (type.equals("mountain bike", ignoreCase = true)) {
            MountainBikeFactory()
        } else if (type.equals("road bike", ignoreCase = true)) {
            RoadBikeFactory()
        } else {
            println("Please specify a valid type")
            null
        }
    }
}