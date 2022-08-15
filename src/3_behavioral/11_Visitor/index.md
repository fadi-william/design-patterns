---
name: 11. Visitor
route: /behavioral/visitor
menu: Behavioral
---

# Visitor

The vistor pattern lets you separate algorithms from the objects on which they operate. Good implementation of the SOLID open closed principle.

## Sample code

```kotlin
interface Groceries {
    val price: Double
    fun accept(visitor: Visitor)
}
```

```kotlin
class Milk : Groceries {
    override var price = 2.0

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
```

```kotlin
class Bread : Groceries {
    override var price = 1.0

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
```

```kotlin
class GroceryList : Groceries {
    private var groceries = ArrayList<Groceries>()

    init {
        val bread = Bread()
        val bread2 = Bread()
        val milk = Milk()
        groceries.add(bread)
        groceries.add(milk)
        groceries.add(bread2)
    }

    override val price: Double
        get() = groceries.stream().mapToDouble(Groceries::price).sum()

    override fun accept(visitor: Visitor) {
        groceries.forEach {
            g -> g.accept(visitor)
        }
        visitor.visit(this)
    }
}
```

```kotlin
interface Visitor {
    fun visit(bread: Bread)
    fun visit(milk: Milk)
    fun visit(groceryList: GroceryList)
}
```

```kotlin
class DiscountVisitor : Visitor {
    override fun visit(bread: Bread) {
        bread.price = 0.9
    }

    override fun visit(milk: Milk) {
        milk.price = 1.6
    }

    override fun visit(groceryList: GroceryList) {
        println("Discounts have been applied to your grocery list")
    }
}
```

```kotlin
object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val groceryList = GroceryList()
        println("Total price of grocery list: " + groceryList.price)
        groceryList.accept(DiscountVisitor())
        println("New total price of grocery list after discount: " + groceryList.price)
    }
}
```
