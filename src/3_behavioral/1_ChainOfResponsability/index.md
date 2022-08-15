---
name: 1. Chain of Responsability
route: /behavioral/chain-of-responsability
menu: Behavioral
---

# Chain of Responsability

The chain of responsability pattern is used to pass along a request until it is handled. It decouples the send from the receiver.

### Care should be taken to avoid:

- Circular chains.
- Make sure that requestes are handled properly.

## Sample Code

```kotlin
abstract class DocumentHandler(
    private val next: DocumentHandler?
) {
    open fun openDocument(fileExtension: String) {
        next?.openDocument(fileExtension)
    }
}

```

```kotlin
class SlideshowHandler(handler: DocumentHandler?) : DocumentHandler(handler) {
    override fun openDocument(fileExtension: String) {
        if (fileExtension == "ppt") {
            println("Opening slideshow document...")
        } else {
            super.openDocument(fileExtension)
        }
    }
}
```

```kotlin
object Client {

    @JvmStatic
    fun main(args: Array<String>) {
        val chain = SpreadsheetHandler(
            SlideshowHandler(
                TextDocumentHandler(null)
            )
        );

        chain.openDocument("ppt")
        chain.openDocument("txt")
        chain.openDocument("xlsx")
    }
}
```