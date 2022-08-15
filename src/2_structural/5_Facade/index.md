---
name: 5. Facade
route: /creational/facade
menu: Structural
---

# Facade

A facade is used to allow the user to perform complex processes with simple actions.

## Sample Code

```kotlin
class VacationFacade {
    fun book(startDate: LocalDate, endDate: LocalDate) {
        val flight = Flight()
        flight.bookOutwardJourney(startDate)
        flight.bookReturnJourney(endDate)

        val hotel = Hotel()
        hotel.book(startDate, endDate)

        val carRental = CarRental()
        carRental.book(startDate, endDate)
    }
}
```

```kotlin
object VacationClient {

    @JvmStatic
    fun main(args: Array<String>) {
        val startDate = LocalDate.of(2021, 8, 1)
        val endDate = LocalDate.of(2021, 8, 15)

        val vacationFacade = VacationFacade()
        vacationFacade.book(startDate, endDate)
    }
}
```