package behavioral.visitor.pattern

interface Groceries {
    val price: Double
    fun accept(visitor: Visitor)
}