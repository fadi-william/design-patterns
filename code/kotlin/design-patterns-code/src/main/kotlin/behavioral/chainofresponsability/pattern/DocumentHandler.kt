package behavioral.chainofresponsability.pattern

abstract class DocumentHandler(
    private val next: DocumentHandler?
) {
    open fun openDocument(fileExtension: String) {
        next?.openDocument(fileExtension)
    }
}
