package structural.flyweight

import structural.flyweight.pattern.Vehicle
import structural.flyweight.pattern.VehicleFactory
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

object TrafficSimulator {
    private var vehicles = ArrayList<Vehicle>()

    @JvmStatic val vehicleFactory = VehicleFactory()

    @JvmStatic
    fun main(args: Array<String>) {
        val createVehicles = Runnable { createRandomCar() }
        val removeVehicles = Runnable { removeCar() }
        val executor = Executors.newScheduledThreadPool(1)
        executor.scheduleAtFixedRate(createVehicles, 0, 3, TimeUnit.SECONDS)
        executor.scheduleAtFixedRate(removeVehicles, 5, 5, TimeUnit.SECONDS)
    }

    private fun createRandomCar() {
        val random = Random()
        val randInt = random.nextInt(2)
        val vehicle = vehicleFactory.getVehicle(randInt)!!;
        vehicle.setLocation(random.nextInt(1000), random.nextInt(1000))
        println(
            "Creating " + vehicle + ", type: " + vehicle.type +
                    ", location: " + vehicle.location[0] + " " + vehicle.location[1]
        )
        vehicles.add(vehicle)
    }

    private fun removeCar() {
        println("Removing " + vehicles[0])
        vehicles.removeAt(0)
    }
}
