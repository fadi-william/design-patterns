package structural.bridge.pattern.colored

import java.awt.Color
import java.awt.Graphics

class BlueColorShape : ColorShape {
    override fun setColor(graphics: Graphics) {
        graphics.color = Color.BLUE
    }
}