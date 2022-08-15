package structural.bridge.pattern.type

import structural.bridge.pattern.colored.ColorShape
import java.awt.Graphics

class Square(private var colorShape: ColorShape) : Shape() {
    override fun draw(graphics: Graphics?) {
        colorShape.setColor(graphics!!)
        graphics.fillRect(5, 15, 50, 50)
    }
}