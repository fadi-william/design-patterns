---
name: 7. Proxy
route: /creational/proxy
menu: Structural
---

# Proxy

The proxy pattern is used to offload the expensive operation when they are necessary only. It helps with the Lazy Loading Scenarios.

## Sample Code

```kotlin
interface DisplayObject {
    fun display()
}
```

```kotlin
class ImageFile(path: String) : DisplayObject {
    private var image: BufferedImage

    init {
        image = load(path)!!
    }

    override fun display() {
        val icon = ImageIcon(image)
        val label = JLabel(icon)
        JOptionPane.showMessageDialog(null, label)
    }

    private fun load(path: String?): BufferedImage? {
        var image: BufferedImage? = null
        try {
            image = ImageIO.read(path?.let { File(it) })
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return image
    }
}
```

```kotlin
class ImageProxy(private val path: String): DisplayObject {
    private var imageFile: ImageFile? = null;

    override fun display() {
        if (imageFile == null) {
            imageFile = ImageFile(path)
        }
        imageFile?.display()
    }
}
```

```kotlin
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
```
