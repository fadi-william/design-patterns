package structural.bridge.pattern.colored

import java.awt.Color
import java.awt.Graphics

class RedColorShape : ColorShape {
    override fun setColor(graphics: Graphics) {
        graphics.color = Color.RED
    }
}