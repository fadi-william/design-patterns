package structural.proxy

import structural.proxy.pattern.DisplayObject
import structural.proxy.pattern.ImageProxy

object ImageGallery {
    @JvmStatic
    fun main(args: Array<String>) {
        val image1: DisplayObject = ImageProxy("src/resources/image1.jpeg")
        val image2: DisplayObject = ImageProxy("src/resources/image2.jpeg")
        val image3: DisplayObject = ImageProxy("src/resources/image3.jpeg")
        val image4: DisplayObject = ImageProxy("src/resources/image4.jpeg")
        val image5: DisplayObject = ImageProxy("src/resources/image5.jpeg")
        val image6: DisplayObject = ImageProxy("src/resources/image6.jpeg")
        val image7: DisplayObject = ImageProxy("src/resources/image7.jpeg")
        val image8: DisplayObject = ImageProxy("src/resources/image8.jpeg")
        val image9: DisplayObject = ImageProxy("src/resources/image9.jpeg")
        val image10: DisplayObject = ImageProxy("src/resources/image10.jpeg")

        image1.display()
        image2.display()
        image3.display()
        image4.display()
        image5.display()
        image6.display()
        image7.display()
        image8.display()
        image9.display()
        image10.display()
        image1.display()
        image2.display()
        image3.display()
        image4.display()
        image5.display()
        image6.display()
        image7.display()
        image8.display()
        image9.display()
        image10.display()
    }
}