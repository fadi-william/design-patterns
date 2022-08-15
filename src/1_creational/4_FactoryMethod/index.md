---
name: 4. Factory Method
route: /creational/factory-method
menu: Creational
---

# Factory Method

The factory method us used when a class doesn't know exactly what objects types need to be created.

# Sample Code

```kotlin
package creational.factory.method

abstract class Candy {
    abstract fun makeCandyPackage(quantity: Int): ArrayList<Candy>
}

abstract class CandyFactory {
    abstract fun getCandy(type: String?): Candy
    open fun getCandyPackage(quantity: Int, type: String?): ArrayList<*>? {
        val candy = getCandy(type)
        return candy.makeCandyPackage(quantity)
    }
}

package creational.factory.method

class ChocolateFactory : CandyFactory() {
    override fun getCandy(type: String?): Candy {
        return when (type) {
            "dark" -> ChocolateDark()
            "white" -> ChocolateWhite()
            "milk" -> ChocolateMilk()
            else -> ChocolateMilk()
        }
    }
}

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
```
