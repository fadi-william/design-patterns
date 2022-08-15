package creational.factory.method

abstract class Candy {
    abstract fun makeCandyPackage(quantity: Int): ArrayList<Candy>
}