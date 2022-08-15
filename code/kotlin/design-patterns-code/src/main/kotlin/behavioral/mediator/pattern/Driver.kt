package behavioral.mediator.pattern

class Driver {
    fun deliver(item: String, quantity: Int, customer: Customer) {
        println(quantity.toString() + " " + item + " out for delivery to " + customer.address)
    }
}
