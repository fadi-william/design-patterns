package behavioral.iterator.pattern

class Inventory(val items: Array<Item>) : Iterable<Item?> {

    override fun iterator(): StockIterator {
        return StockIterator(this)
    }
}
