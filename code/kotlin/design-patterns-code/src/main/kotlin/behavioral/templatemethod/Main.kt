package behavioral.templatemethod

import behavioral.templatemethod.pattern.MeatFeastPizza
import behavioral.templatemethod.pattern.VegetarianPizza

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val vegetarian = VegetarianPizza()
        vegetarian.makeBase()
        vegetarian.addToppings()
        vegetarian.cook()
        println()
        val meatFeast = MeatFeastPizza()
        meatFeast.makeBase()
        meatFeast.addToppings()
        meatFeast.cook()
    }
}