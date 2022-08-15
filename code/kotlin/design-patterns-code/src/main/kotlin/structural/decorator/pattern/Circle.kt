package structural.decorator.pattern

import java.awt.Graphics

class Circle(private val x: Int, private val y: Int) : Component {
    override fun draw(graphics: Graphics) {
        graphics.drawOval(x, y, 50, 50)
    }
}
