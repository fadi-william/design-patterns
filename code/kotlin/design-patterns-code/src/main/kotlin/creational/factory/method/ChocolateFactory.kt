package creational.factory.method

class ChocolateFactory : CandyFactory() {
    override fun getCandy(type: String?): Candy {
        return when (type) {
            "dark" -> ChocolateDark()
            "white" -> ChocolateWhite()
            "milk" -> ChocolateMilk()
            else -> ChocolateMilk()
        }
    }
}