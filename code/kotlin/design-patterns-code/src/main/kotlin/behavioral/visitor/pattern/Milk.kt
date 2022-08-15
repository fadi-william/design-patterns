package behavioral.visitor.pattern

class Milk : Groceries {
    override var price = 2.0

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
