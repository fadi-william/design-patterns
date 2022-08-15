package creational.singleton

object ResourceManager {

    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        // First thread
        val threadOne = Thread { val s = PrintSpooler.instance }
        // Second thread
        val threadTwo = Thread { val p = PrintSpooler.instance }
        threadOne.start()
        threadTwo.start()
    }
}