---
name: 2. Command
route: /behavioral/command
menu: Behavioral
---

# Command

This pattern involves creating an object whose responsibility is to execute the request.

## Sample Code

```kotlin
interface Command {
    fun execute()
}
```

```kotlin
class Document {
    fun save() {
        println("Saving document...")
    }

    fun print() {
        println("Printing document...")
    }
}
```

```kotlin
class PrintCommand(private val document: Document) : Command {
    override fun execute() {
        document.print()
    }
}
```

```kotlin
class Button(var text: String) {
    fun click(command: Command) {
        command.execute()
    }
}
```

```kotlin
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
```
