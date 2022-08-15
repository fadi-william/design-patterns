package structural.adapter

import org.example.UKCarPriceCalculator
import structural.adapter.domain.CarPriceCalculator
import structural.adapter.domain.PriceCalculator
import structural.adapter.domain.TruckPriceCalculator
import structural.adapter.pattern.PriceCalculatorAdapter

fun main() {
    val carPriceCalculator = CarPriceCalculator("Ford", 3)
    printVehiclePrice(carPriceCalculator)
    val truckPriceCalculator = TruckPriceCalculator(10, 0)
    printVehiclePrice(truckPriceCalculator)

    val ukCarPriceCalculator = UKCarPriceCalculator("BMW", 7)
    val ukCarPriceAdapter = PriceCalculatorAdapter(ukCarPriceCalculator)
    println(ukCarPriceAdapter)
}

fun printVehiclePrice(calculator: PriceCalculator) {
    val price = calculator.calculatePrice()
    println("The price of vehicle is: $price")
}
