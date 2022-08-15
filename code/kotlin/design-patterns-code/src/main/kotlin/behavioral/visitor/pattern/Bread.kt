package behavioral.visitor.pattern

class Bread : Groceries {
    override var price = 1.0

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}