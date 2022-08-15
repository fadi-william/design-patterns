package structural.proxy.pattern

import java.awt.image.BufferedImage
import java.io.File
import java.io.IOException
import javax.imageio.ImageIO
import javax.swing.ImageIcon
import javax.swing.JLabel
import javax.swing.JOptionPane

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