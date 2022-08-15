package behavioral.iterator.pattern

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
