package behavioral.mediator

import behavioral.mediator.pattern.Customer
import behavioral.mediator.pattern.Driver
import behavioral.mediator.pattern.ECommerceSite
import behavioral.mediator.pattern.Mediator

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val mediator = Mediator(Customer("123 Sunny Street"), Driver(), ECommerceSite())
        mediator.buy("pens", 3)
    }
}
