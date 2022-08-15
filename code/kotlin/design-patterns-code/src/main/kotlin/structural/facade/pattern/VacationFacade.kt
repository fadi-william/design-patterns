package structural.facade.pattern

import java.time.LocalDate

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