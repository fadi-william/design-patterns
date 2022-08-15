package creational.factory.abstract

class MountainBikeFactory : BikeFactory() {
    override fun create(type: String): BikePart? {
        return if (type.equals("tire", ignoreCase = true)) {
            MountainBikeTire()
        } else if (type.equals("handlebar", ignoreCase = true)) {
            MountainBikeHandlebar()
        } else {
            null
        }
    }
}