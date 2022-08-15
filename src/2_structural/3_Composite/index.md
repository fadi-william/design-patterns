---
name: 3. Composite
route: /structural/composite
menu: Structural
---

# Composite

## Description

The composite pattern is used when you want to treat a single objects and groups of objects the same or when you have code that is very similar/identical to handle different types of objects.

## Sample Code

```kotlin
class Manager(private val name: String): Payee {
    override fun payExpenses(amount: Int) {
        println("$name has been paid $$amount")
    }
}
```

```kotlin
interface Payee {
    fun payExpenses(amount: Int);
}
```

```kotlin
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
```
