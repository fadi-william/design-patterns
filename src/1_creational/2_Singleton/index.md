---
name: 2. Singleton
route: /creational/singleton
menu: Creational
---

# Singleton

The singleton pattern is used when we need an object of the class to be only initialized one time only.

Example in the Java SDK:

- Collection class's singleton list.
- Collection class's singleton map.
- Collection class's singleton set.

# Sample Code

```kotlin
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
```
