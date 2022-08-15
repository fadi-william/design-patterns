---
name: 6. Memento
route: /behavioral/memento
menu: Behavioral
---

# Memento

The memento design pattern externalizes states without violating encapsulation. It is commonly used for the undo functionalities.

/!\ Warning - Can be Memory Intensive. Good for simple object states.

## Sample Code

```kotlin
class Memento(var state: String)
```

```kotlin
class TextDocument {
    private var text = ""
    private val memento = Memento(text)

    fun write(text: String) {
        this.text += text
    }

    fun print() {
        println(text)
    }

    fun save() {
        memento.state = text
    }

    fun undo() {
        text = memento.state
    }
}
```

```kotlin
object DocumentViewer {
    private val textDocument = TextDocument()
    @JvmStatic
    fun main(args: Array<String>) {
        textDocument.write("hello")
        textDocument.save()
        textDocument.print()
        textDocument.write(" world")
        textDocument.print()
        textDocument.undo()
        textDocument.print()
    }
}
```
