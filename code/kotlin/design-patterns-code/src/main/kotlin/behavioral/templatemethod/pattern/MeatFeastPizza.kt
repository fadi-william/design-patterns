package behavioral.templatemethod.pattern

class MeatFeastPizza : Pizza() {
    override fun addToppings() {
        super.addToppings()
        println("Add pepperoni")
        println("Add ham")
        println("Add chicken")
    }

    override fun cook() {
        println("Cook in the oven for 20 minutes")
    }
}