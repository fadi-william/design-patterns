package structural.flyweight.pattern

interface Vehicle {
    val type: String
    val location: IntArray
    fun setLocation(latitude: Int, longitude: Int)
}