---
name: 4. Decorator
route: /creational/decorator
menu: Structural
---

# Decorator

The decorator pattern is used when you want to add additional responsabilities to an object dynamically. It is used when we need more flexibility than what subclassing allows.

## Sample Code

```kotlin
class ComponentWithRedBorder(private val decoratedComponent: Component): Component {
    override fun draw(graphics: Graphics) {
        graphics.color = Color.RED;
        decoratedComponent.draw(graphics);
        graphics.color = Color.BLACK;
    }
}
```

```kotlin
interface Component {
    fun draw(graphics: Graphics)
}
```

```kotlin
class Circle(private val x: Int, private val y: Int) : Component {
    override fun draw(graphics: Graphics) {
        graphics.drawOval(x, y, 50, 50)
    }
}
```

```kotlin
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
```
