---
name: 4. Reorder
route: /behavioral/reorder
menu: Behavioral
---

# Iterator

The interator pattern helps iterate over a set of objects.

## Sample Code

```kotlin
class Item(val name: String, val quantity: Int) {}
```

```kotlin
class StockIterator(
    private val inventory: Inventory
): Iterator<Item?> {
    private var index: Int = 0;

    override fun hasNext(): Boolean {
        val items = inventory.items
        return index < items.size
    }

    override fun next(): Item? {
        val items = inventory.items
        if (hasNext()) {
            val item = items[index++]
            return if (item.quantity > 0) {
                item
            } else {
                next();
            }
        }

        return null;
    }
}
```

```kotlin
class Inventory(val items: Array<Item>) : Iterable<Item?> {

    override fun iterator(): StockIterator {
        return StockIterator(this)
    }
}
```

```kotlin
object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val pens = Item("pens", 175)
        val pencils = Item("pencils", 0)
        val paper = Item("paper", 500)

        val inventory = Inventory(arrayOf(pens, pencils, paper))
        val stockIterator = inventory.iterator()

        while (stockIterator.hasNext()) {
            val item = stockIterator.next()
            println(item?.name)
        }
    }
}
```
