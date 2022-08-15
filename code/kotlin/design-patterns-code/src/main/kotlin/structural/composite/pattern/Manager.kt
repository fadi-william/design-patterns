package structural.composite.pattern

class Manager(private val name: String): Payee {
    override fun payExpenses(amount: Int) {
        println("$name has been paid $$amount")
    }
}