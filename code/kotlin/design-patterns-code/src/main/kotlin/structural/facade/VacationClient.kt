package structural.facade

import structural.facade.pattern.VacationFacade
import java.time.LocalDate

object VacationClient {

    @JvmStatic
    fun main(args: Array<String>) {
        val startDate = LocalDate.of(2021, 8, 1)
        val endDate = LocalDate.of(2021, 8, 15)

        val vacationFacade = VacationFacade()
        vacationFacade.book(startDate, endDate)
    }
}
