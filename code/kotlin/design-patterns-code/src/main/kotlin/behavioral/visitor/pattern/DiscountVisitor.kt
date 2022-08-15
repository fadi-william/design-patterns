package behavioral.visitor.pattern

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