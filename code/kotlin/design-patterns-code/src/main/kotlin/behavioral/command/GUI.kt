package behavioral.command

import behavioral.command.pattern.Button
import behavioral.command.pattern.Document
import behavioral.command.pattern.PrintCommand
import behavioral.command.pattern.SaveCommand

object GUI {
    private val document = Document()

    @JvmStatic
    fun main(args: Array<String>) {
        val saveButton = Button("Save")
        val printButton = Button("Print")

        saveButton.click(SaveCommand(document))
        printButton.click(PrintCommand(document))
    }
}