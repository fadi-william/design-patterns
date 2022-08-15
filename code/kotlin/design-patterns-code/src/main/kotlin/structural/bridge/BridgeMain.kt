package structural.bridge

import structural.bridge.pattern.colored.BlueColorShape
import structural.bridge.pattern.colored.GreenColorShape
import structural.bridge.pattern.colored.RedColorShape
import structural.bridge.pattern.type.Circle
import structural.bridge.pattern.type.Square
import structural.bridge.pattern.type.Triangle
import java.awt.Dimension
import java.awt.Graphics
import javax.swing.JFrame
import javax.swing.JPanel

class Canvas : JPanel() {
    override fun paint(graphics: Graphics?) {
        val square = Square(BlueColorShape())
        square.draw(graphics)
        val circle = Circle(RedColorShape())
        circle.draw(graphics)
        val triangle = Triangle(GreenColorShape())
        triangle.draw(graphics)
    }
}

fun main() {
    val frame = JFrame()
    frame.size = Dimension(400, 400)
    frame.add(Canvas())
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.isVisible = true
}
