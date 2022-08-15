package structural.adapter.domain

import kotlin.math.max

class TruckPriceCalculator(private val age: Int, private val mileage: Int) : PriceCalculator {

    override fun calculatePrice(): String {
        val price = max(averagePrice - age * 100 - mileage / 100, 0)
        return price.toString() + "USD"
    }

    companion object {
        var averagePrice = 10000
    }
}
