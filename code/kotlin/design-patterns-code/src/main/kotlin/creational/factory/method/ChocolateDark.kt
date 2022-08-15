package creational.factory.method

class ChocolateDark : Candy() {
    override fun makeCandyPackage(quantity: Int): ArrayList<Candy> {
        val chocolatePackage: ArrayList<Candy> = ArrayList()
        for (i in 1..quantity) {
            val chocolate = ChocolateDark()
            chocolatePackage.add(chocolate)
        }
        println("One package of $quantity dark chocolates has been made!")
        return chocolatePackage
    }
}