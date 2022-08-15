---
name: 5. Abstract Factory
route: /creational/abstract-factory
menu: Creational
---

# Abstract Factory

Creates families of objects. Think of a bike builder. The bike builder cass just wants to ask for parts and be given them, not make them. This pattern promotes consistency.

# Sample Code

```kotlin
package creational.factory.abstract

abstract class BikeFactory {
    abstract fun create(type: String): BikePart?
}

package creational.factory.abstract

class MountainBikeFactory : BikeFactory() {
    override fun create(type: String): BikePart? {
        return if (type.equals("tire", ignoreCase = true)) {
            MountainBikeTire()
        } else if (type.equals("handlebar", ignoreCase = true)) {
            MountainBikeHandlebar()
        } else {
            null
        }
    }
}

package creational.factory.abstract

abstract class BikePart {
    abstract val description: Unit
}

package creational.factory.abstract

abstract class Handlebar : BikePart() {
    abstract override val description: Unit
}

package creational.factory.abstract

class MountainBikeHandlebar : Handlebar() {
    override val description: Unit
        get() {
            println("Mountain bike handlebar. Type: " + type)
        }

    companion object {
        private const val type = "FLAT"
    }
}

package creational.factory.abstract

abstract class Tire : BikePart() {
    abstract override val description: Unit
}

package creational.factory.abstract

class MountainBikeTire : Tire() {
    override val description: Unit
        get() {
            println("Mountain bike tire. Width: " + width + ", pressure: " + pressure)
        }

    companion object {
        private const val width = "WIDE"
        private const val pressure = "MEDIUM"
    }
}
```

# Executor

```kotlin
package creational.factory.abstract

object BikeBuilder {
    @JvmStatic
    fun main(args: Array<String>) {
        createBikeWithExtensibleAbstractFactory("mountain bike")
    }

    fun createBikeWithExtensibleAbstractFactory(type: String) {
        val bikeFactory = FactoryCreator.createFactory(type)
        val tireFront = bikeFactory?.create("tire") as Tire
        tireFront.description
        val tireBack = bikeFactory.create("tire") as Tire
        tireBack.description
        val handlebar = bikeFactory.create("handlebar") as Handlebar
        handlebar.description
    }
}
```
