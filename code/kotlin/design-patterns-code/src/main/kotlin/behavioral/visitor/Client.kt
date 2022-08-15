package behavioral.visitor

import behavioral.visitor.pattern.DiscountVisitor
import behavioral.visitor.pattern.GroceryList

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val groceryList = GroceryList()
        println("Total price of grocery list: " + groceryList.price)
        groceryList.accept(DiscountVisitor())
        println("New total price of grocery list after discount: " + groceryList.price)
    }
}