package behavioral.memento

import behavioral.memento.pattern.TextDocument

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