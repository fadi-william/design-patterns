package creational.factory.abstract

class RoadBikeFactory : BikeFactory() {

    override fun create(type: String): BikePart? {
        return if (type.equals("tire", ignoreCase = true)) {
            RoadBikeTire()
        } else if (type.equals("handlebar", ignoreCase = true)) {
            RoadBikeHandlebar()
        } else {
            null
        }
    }
}