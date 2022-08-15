package behavioral.chainofresponsability.pattern

class SpreadsheetHandler(handler: DocumentHandler?) : DocumentHandler(handler) {
    override fun openDocument(fileExtension: String) {
        if (fileExtension == "xlsx") {
            println("Opening spreadsheet document...")
        } else {
            super.openDocument(fileExtension)
        }
    }
}
