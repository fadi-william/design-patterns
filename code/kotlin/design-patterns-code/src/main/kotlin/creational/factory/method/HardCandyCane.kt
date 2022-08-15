package creational.factory.method

class HardCandyCane : Candy() {
    override fun makeCandyPackage(quantity: Int): ArrayList<Candy> {
        val hardCandyPackage: ArrayList<Candy> = ArrayList()
        for (i in 1..quantity) {
            val candyCane = HardCandyCane()
            hardCandyPackage.add(candyCane)
        }
        println((quantity / 10).toString() + " packages of 10 candy canes have been made!")
        return hardCandyPackage
    }
}