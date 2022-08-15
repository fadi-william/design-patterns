package creational.factory.method

class HardCandyLollipop : Candy() {
    override fun makeCandyPackage(quantity: Int): ArrayList<Candy> {
        val hardCandyPackage: ArrayList<Candy> = ArrayList()
        for (i in 1..quantity) {
            val lollipop = HardCandyLollipop()
            hardCandyPackage.add(lollipop)
        }
        println("One package of $quantity hard candy has been made!")
        return hardCandyPackage
    }
}
