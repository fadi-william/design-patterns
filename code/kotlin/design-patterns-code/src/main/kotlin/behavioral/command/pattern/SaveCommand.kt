package behavioral.command.pattern

class SaveCommand(private val document: Document) : Command {
    override fun execute() {
        document.save()
    }
}
