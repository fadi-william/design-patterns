package creational.factory.method

abstract class CandyFactory {
    abstract fun getCandy(type: String?): Candy
    open fun getCandyPackage(quantity: Int, type: String?): ArrayList<*>? {
        val candy = getCandy(type)
        return candy.makeCandyPackage(quantity)
    }
}