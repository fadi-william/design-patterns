package behavioral.mediator.pattern

class ECommerceSite() {
    private val stock: HashMap<String, Int> = HashMap()

    init {
        stock["pens"] = 100
        stock["pencils"] = 50
        stock["erasers"] = 75
    }

    fun checkInStock(item: String, quantity: Int): Boolean {
        return stock.containsKey(item) && stock[item]!! > quantity
    }

    fun sell(item: String, quantity: Int) {
        val newQuantity = stock[item]!! - quantity
        stock[item] = newQuantity
    }
}