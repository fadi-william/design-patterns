package behavioral.command.pattern

class Button(var text: String) {
    fun click(command: Command) {
        command.execute()
    }
}