---
name: 10. Template Method
route: /behavioral/template-method
menu: Behavioral
---

# Template Method

This pattern defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

## Sample Code

```kotlin
abstract class Pizza {
    fun makeBase() {
        println("Mix flour, yeast and salt")
        println("Roll out the dough")
    }

    open fun addToppings() {
        println("Add tomato")
        println("Add cheese")
    }

    open fun cook() {
        // To be implemented in subclasses.
    }
}
```

```kotlin
class MeatFeastPizza : Pizza() {
    override fun addToppings() {
        super.addToppings()
        println("Add pepperoni")
        println("Add ham")
        println("Add chicken")
    }

    override fun cook() {
        println("Cook in the oven for 20 minutes")
    }
}
```

```kotlin
class VegetarianPizza : Pizza() {
    override fun addToppings() {
        super.addToppings()
        println("Add peppers")
        println("Add olives")
    }

    override fun cook() {
        println("Cook in the oven for 15 minutes")
    }
}
```

```kotlin
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val vegetarian = VegetarianPizza()
        vegetarian.makeBase()
        vegetarian.addToppings()
        vegetarian.cook()
        println()
        val meatFeast = MeatFeastPizza()
        meatFeast.makeBase()
        meatFeast.addToppings()
        meatFeast.cook()
    }
}
```
