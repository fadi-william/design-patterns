package creational.factory.abstract

abstract class BikeFactory {
    abstract fun create(type: String): BikePart?
}