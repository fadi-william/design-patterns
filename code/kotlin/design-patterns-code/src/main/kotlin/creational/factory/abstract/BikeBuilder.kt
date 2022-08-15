package creational.factory.abstract

object BikeBuilder {
    @JvmStatic
    fun main(args: Array<String>) {
        createBikeWithExtensibleAbstractFactory("road bike")
    }

    fun createBikeWithExtensibleAbstractFactory(type: String) {
        val bikeFactory = FactoryCreator.createFactory(type)
        val tireFront = bikeFactory?.create("tire") as Tire
        tireFront.description
        val tireBack = bikeFactory.create("tire") as Tire
        tireBack.description
        val handlebar = bikeFactory.create("handlebar") as Handlebar
        handlebar.description
    }
}