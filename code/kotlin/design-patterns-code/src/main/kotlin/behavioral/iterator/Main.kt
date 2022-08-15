package behavioral.iterator

import behavioral.iterator.pattern.Inventory
import behavioral.iterator.pattern.Item

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
