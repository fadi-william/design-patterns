package structural.adapter.pattern

import org.example.UKCarPriceCalculator
import structural.adapter.domain.PriceCalculator

class PriceCalculatorAdapter(private val ukCarPriceCalculator: UKCarPriceCalculator) : PriceCalculator {

    override fun calculatePrice(): String {
        return ukCarPriceCalculator.price.toString() + "GBP";
    }
}