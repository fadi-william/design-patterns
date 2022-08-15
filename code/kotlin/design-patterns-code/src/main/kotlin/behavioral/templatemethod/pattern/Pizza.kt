package behavioral.templatemethod.pattern

abstract class Pizza {
    fun makeBase() {
        println("Mix flour, yeast and salt")
        println("Roll out the dough")
    }

    open fun addToppings() {
        println("Add tomato")
        println("Add cheese")
    }

    open fun cook() {
        // To be implemented in subclasses.
    }
}