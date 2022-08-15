package structural.composite.pattern

class SalesTeam: Payee {
    private val payees: MutableList<Payee> = ArrayList()

    fun addPayee(payee: Payee) {
        payees.add(payee)
    }

    override fun payExpenses(amount: Int) {
        payees.forEach { payee -> payee.payExpenses(amount) }
    }
}