package creational.factory.method

class HardCandyPeppermint : Candy() {
    override fun makeCandyPackage(quantity: Int): ArrayList<Candy> {
        val hardCandyPackage: ArrayList<Candy> = ArrayList()
        for (i in 1..quantity) {
            val hardCandyPeppermint = HardCandyPeppermint()
            hardCandyPackage.add(hardCandyPeppermint)
        }
        println("One package of $quantity peppermints has been made!")
        return hardCandyPackage
    }
}
