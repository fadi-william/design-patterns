package structural.adapter.domain

import kotlin.math.max

class CarPriceCalculator(private val model: String, private val age: Int) : PriceCalculator {

    val retailPrice: Int
        get() = when (model) {
            "Ford" -> 3000
            "Audi" -> 5000
            "BMW" -> 7000
            "Tesla" -> 10000
            else -> averageCarPrice
        }

    override fun calculatePrice(): String {
        val price = max(retailPrice - age * 100, 0)
        return price.toString() + "USD"
    }

    companion object {
        var averageCarPrice = 6000
    }
}
