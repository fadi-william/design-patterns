package creational.prototype

/**
 *
 * @author bethan
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val rabbit = Rabbit()
        rabbit.setOwner("Sally")
        val rabbitCopy = rabbit.clone()
        println("Name of first owner " + rabbit.owner?.name)
        println("Name of first owner " + rabbitCopy.owner?.name)
        rabbitCopy.owner?.name = "Steve"
        println("Name of first owner " + rabbit.owner?.name)
        println("Name of first owner " + rabbitCopy.owner?.name)
    }
}