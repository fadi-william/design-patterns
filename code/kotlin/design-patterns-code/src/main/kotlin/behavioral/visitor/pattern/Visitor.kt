package behavioral.visitor.pattern

interface Visitor {
    fun visit(bread: Bread)
    fun visit(milk: Milk)
    fun visit(groceryList: GroceryList)
}
