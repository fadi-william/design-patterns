package creational.singleton

class PrintSpooler private constructor() {
    private fun init() {
        // Code to initialize our printer spooler goes here
    }

    companion object {
        private val spooler = PrintSpooler()
        private var initialized = false

        @JvmStatic
        @get:Synchronized
        val instance: PrintSpooler
            get() {
                if (initialized) return spooler
                spooler.init()
                initialized = true
                return spooler
            }
    }
}