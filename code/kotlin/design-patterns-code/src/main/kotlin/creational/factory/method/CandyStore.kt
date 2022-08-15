package creational.factory.method

object CandyStore {
    private val chocolateFactory: CandyFactory = ChocolateFactory()
    private val hardCandyFactory: CandyFactory = HardCandyFactory()

    @JvmStatic
    fun main(args: Array<String>) {
        chocolateFactory.getCandyPackage(7, "dark")
        hardCandyFactory.getCandyPackage(14, "lollipop")
        hardCandyFactory.getCandyPackage(50, "candy cane")
    }
}