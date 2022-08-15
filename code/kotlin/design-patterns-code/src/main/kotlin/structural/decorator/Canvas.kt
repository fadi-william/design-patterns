package structural.decorator

import structural.decorator.pattern.Circle
import structural.decorator.pattern.Component
import structural.decorator.pattern.ComponentWithRedBorder
import java.awt.Graphics
import javax.swing.JFrame
import javax.swing.JPanel

class Canvas : JPanel() {
    private var circle1: Component = Circle(15, 15)
    private var circle2: Component = Circle(75, 15)
    private var circle3: Component = Circle(135, 15)

    override fun paint(graphics: Graphics) {
        circle1.draw(graphics)
        // Decorate circle 2.
        ComponentWithRedBorder(circle2).draw(graphics)
        circle3.draw(graphics)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // Creates a canvas to draw on.
            val frame = JFrame()
            frame.setSize(400, 400)
            frame.add(Canvas())
            frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            frame.isVisible = true
        }
    }
}
