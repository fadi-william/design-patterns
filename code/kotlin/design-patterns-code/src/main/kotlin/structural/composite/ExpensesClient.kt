package structural.composite

import structural.composite.pattern.Manager
import structural.composite.pattern.Payee
import structural.composite.pattern.SalesTeam
import structural.composite.pattern.Salesperson

object ExpensesClient {

    @JvmStatic
    fun main(args: Array<String>) {
        // Managers.
        val jane = Manager("Jane")

        // Sales Members.
        val bob = Salesperson("Bob", jane)
        val sue = Salesperson("Sue", jane)

        // Sales Team.
        val team = SalesTeam()
        team.addPayee(jane)
        team.addPayee(bob)
        team.addPayee(sue)

        // Pay Manager.
        payPayee(jane, 100)

        // Pay Sales Person.
        payPayee(bob, 300)

        // Pay Team.
        payPayee(team, 200)
    }

    private fun payPayee(payee: Payee, amount: Int) {
        println("Expenses have been requested")
        payee.payExpenses(amount)
        println("Expenses have been paid\n")
    }
}
