package behavioral.mediator.pattern

class Mediator(private val customer: Customer,
               private val driver: Driver,
               private val eCommerceSite: ECommerceSite) {

    fun buy(item: String, quantity: Int) {
        if (eCommerceSite.checkInStock(item, quantity)) {
            eCommerceSite.sell(item, quantity);
            driver.deliver(item, quantity, customer)
        }
    }
}