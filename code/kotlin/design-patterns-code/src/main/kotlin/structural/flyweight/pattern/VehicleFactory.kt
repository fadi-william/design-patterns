package structural.flyweight.pattern

class VehicleFactory {

    private var vehicles = HashMap<Int, Vehicle>()

    fun getVehicle(type: Int): Vehicle? {
        return if (vehicles.containsKey(type)) {
            vehicles[type]
        } else {
            val vehicle = if (type == 0) {
                Car()
            } else {
                Truck()
            }
            vehicles[type] = vehicle
            vehicle
        }
    }
}