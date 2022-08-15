package structural.flyweight.pattern

class Truck : Vehicle {
    override val location = IntArray(2)
    override val type: String
        get() = "Truck"

    override fun setLocation(latitude: Int, longitude: Int) {
        location[0] = latitude
        location[1] = longitude
    }
}