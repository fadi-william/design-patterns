package structural.bridge.pattern.type

import structural.bridge.pattern.colored.ColorShape
import java.awt.Graphics

class Triangle(private var colorShape: ColorShape) : Shape() {

    override fun draw(graphics: Graphics?) {
        colorShape.setColor(graphics!!)
        val x = listOf(200, 250, 150).toIntArray()
        val y = listOf(15, 65, 65).toIntArray()
        val n = 3
        graphics.fillPolygon(x, y, n)
    }
}