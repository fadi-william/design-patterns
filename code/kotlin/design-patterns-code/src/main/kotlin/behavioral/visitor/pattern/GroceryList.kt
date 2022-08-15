package behavioral.visitor.pattern

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