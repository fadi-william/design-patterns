package structural.decorator.pattern

import java.awt.Color
import java.awt.Graphics

class ComponentWithRedBorder(private val decoratedComponent: Component): Component {
    override fun draw(graphics: Graphics) {
        graphics.color = Color.RED;
        decoratedComponent.draw(graphics);
        graphics.color = Color.BLACK;
    }
}
