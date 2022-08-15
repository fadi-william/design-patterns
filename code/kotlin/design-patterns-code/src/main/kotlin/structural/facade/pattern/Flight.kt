package structural.facade.pattern

import java.time.LocalDate

class Flight {
    fun bookOutwardJourney(start: LocalDate) {
        println("Outbound flight booked for $start")
    }

    fun bookReturnJourney(end: LocalDate) {
        println("Return flight booked for $end")
    }
}