package structural.proxy.pattern

class ImageProxy(private val path: String): DisplayObject {
    private var imageFile: ImageFile? = null;

    override fun display() {
        if (imageFile == null) {
            imageFile = ImageFile(path)
        }
        imageFile?.display()
    }
}