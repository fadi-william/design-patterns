package structural.flyweight.pattern

class Car : Vehicle {
    override val location = IntArray(2)
    override val type: String
        get() = "Car"

    override fun setLocation(latitude: Int, longitude: Int) {
        location[0] = latitude
        location[1] = longitude
    }
}