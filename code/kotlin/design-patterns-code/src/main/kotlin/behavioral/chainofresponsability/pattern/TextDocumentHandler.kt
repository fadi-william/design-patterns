package behavioral.chainofresponsability.pattern

class TextDocumentHandler(handler: DocumentHandler?) : DocumentHandler(handler) {
    override fun openDocument(fileExtension: String) {
        if (fileExtension == "txt") {
            println("Opening text document...")
        } else {
            super.openDocument(fileExtension)
        }
    }
}
