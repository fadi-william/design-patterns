package creational.factory.method

class ChocolateWhite : Candy() {
    override fun makeCandyPackage(quantity: Int): ArrayList<Candy> {
        val chocolatePackage: ArrayList<Candy> = ArrayList()
        for (i in 1..quantity) {
            val chocolate = ChocolateWhite()
            chocolatePackage.add(chocolate)
        }
        println("One package of $quantity white chocolates has been made!")
        return chocolatePackage
    }
}