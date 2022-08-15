---
name: 5. Mediator
route: /behavioral/mediator
menu: Behavioral
---

# Mediator

The idea of the mediator pattern is to have an object that's sole purpose is to handle the interactions between a set of objects. This is a common solution to circular dependencies between objects.

## Sample Code

```kotlin
class Customer(val address: String)
```

```kotlin
class Driver {
    fun deliver(item: String, quantity: Int, customer: Customer) {
        println(quantity.toString() + " " + item + " out for delivery to " + customer.address)
    }
}
```

```kotlin
class ECommerceSite() {
    private val stock: HashMap<String, Int> = HashMap()

    init {
        stock["pens"] = 100
        stock["pencils"] = 50
        stock["erasers"] = 75
    }

    fun checkInStock(item: String, quantity: Int): Boolean {
        return stock.containsKey(item) && stock[item]!! > quantity
    }

    fun sell(item: String, quantity: Int) {
        val newQuantity = stock[item]!! - quantity
        stock[item] = newQuantity
    }
}
```

```kotlin
class Mediator(private val customer: Customer,
               private val driver: Driver,
               private val eCommerceSite: ECommerceSite) {

    fun buy(item: String, quantity: Int) {
        if (eCommerceSite.checkInStock(item, quantity)) {
            eCommerceSite.sell(item, quantity);
            driver.deliver(item, quantity, customer)
        }
    }
}
```

```kotlin
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val mediator = Mediator(Customer("123 Sunny Street"), Driver(), ECommerceSite())
        mediator.buy("pens", 3)
    }
}
```
