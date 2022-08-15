package behavioral.chainofresponsability

import behavioral.chainofresponsability.pattern.SlideshowHandler
import behavioral.chainofresponsability.pattern.SpreadsheetHandler
import behavioral.chainofresponsability.pattern.TextDocumentHandler

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
