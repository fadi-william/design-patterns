package creational.builder

import java.awt.Color
import java.awt.Dimension

class Room(
    private val dimensions: Dimension?,
    private val ceilingHeight: Int,
    private val floorNumber: Int,
    private val wallColor: Color?,
    private val numberOfWindows: Int,
    private val numberOfDoors: Int?
)