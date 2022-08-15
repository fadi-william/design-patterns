---
name: 6. Flyweight
route: /creational/flyweight
menu: Structural
---

# Flyweight

A flyweight pattern is used to optimize memory by sharing the intrinsic state of an object and can be used to save memory by using a single object instead of many.

## Sample Code

```kotlin
interface Vehicle {
    val type: String
    val location: IntArray
    fun setLocation(latitude: Int, longitude: Int)
}
```

```kotlin
class Truck : Vehicle {
    override val location = IntArray(2)
    override val type: String
        get() = "Truck"

    override fun setLocation(latitude: Int, longitude: Int) {
        location[0] = latitude
        location[1] = longitude
    }
}
```

```kotlin
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
```

```kotlin
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
```
