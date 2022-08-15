package creational.factory.method

class HardCandyFactory : CandyFactory() {
    override fun getCandy(type: String?): Candy {
        return when (type) {
            "candycane" -> HardCandyCane()
            "lollipop" -> HardCandyLollipop()
            "peppermint" -> HardCandyPeppermint()
            else -> HardCandyCane()
        }
    }

    override fun getCandyPackage(quantity: Int, type: String?): ArrayList<*>? {
        val candy = getCandy(type)
        if (quantity % 10 != 0) {
            println("Hard candy must be packaged in multiples of 10.")
            return null
        }
        return candy.makeCandyPackage(quantity)
    }
}