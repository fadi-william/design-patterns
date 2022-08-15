package behavioral.memento.pattern

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
