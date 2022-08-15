package behavioral.templatemethod.pattern

class VegetarianPizza : Pizza() {
    override fun addToppings() {
        super.addToppings()
        println("Add peppers")
        println("Add olives")
    }

    override fun cook() {
        println("Cook in the oven for 15 minutes")
    }
}