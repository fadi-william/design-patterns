package behavioral.command.pattern

class PrintCommand(private val document: Document) : Command {
    override fun execute() {
        document.print()
    }
}