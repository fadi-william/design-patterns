package behavioral.chainofresponsability.pattern

class SlideshowHandler(handler: DocumentHandler?) : DocumentHandler(handler) {
    override fun openDocument(fileExtension: String) {
        if (fileExtension == "ppt") {
            println("Opening slideshow document...")
        } else {
            super.openDocument(fileExtension)
        }
    }
}