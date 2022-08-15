package creational.factory.method

class ChocolateMilk : Candy() {
    override fun makeCandyPackage(quantity: Int): ArrayList<Candy> {
        val chocolatePackage: ArrayList<Candy> = ArrayList()
        for (i in 1..quantity) {
            val chocolate = ChocolateMilk()
            chocolatePackage.add(chocolate)
        }
        println("One package of $quantity milk chocolates has been made!")
        return chocolatePackage
    }
}