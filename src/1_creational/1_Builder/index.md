---
name: 1. Builder
route: /creational/builder
menu: Creational
---

# Builder

This design patterns helps eliminate complex constructors. It helps avoid the telescoping constuctor pattern.

# Sample Code

Let's create a builder for the following class.

```kotlin
package creational.builder

import java.awt.Color
import java.awt.Dimension

class Bedroom(
    private val dimensions: Dimension?,
    private val ceilingHeight: Int?,
    private val floorNumber: Int?,
    private val wallColor: Color?,
    private val numberOfWindows: Int?,
    private val numberOfDoors: Int?,
    private val isDouble: Boolean?,
    private val hasEnsuite: Boolean?
)
```

The builder will be:

```kotlin
package creational.builder

import java.awt.Color
import java.awt.Dimension

class BedroomBuilder {
    private var dimensions: Dimension? = null
    private var ceilingHeight = 0
    private var floorNumber = 0
    private var wallColor: Color? = null
    private var numberOfWindows = 0
    private var numberOfDoors = 0
    private var isDouble = false
    private var hasEnsuite = false

    fun setDimensions(dimensions: Dimension?): BedroomBuilder {
        this.dimensions = dimensions
        return this
    }

    fun setCeilingHeight(ceilingHeight: Int): BedroomBuilder {
        this.ceilingHeight = ceilingHeight
        return this
    }

    fun setFloorNumber(floorNumber: Int): BedroomBuilder {
        this.floorNumber = floorNumber
        return this
    }

    fun setWallColor(wallColor: Color?): BedroomBuilder {
        this.wallColor = wallColor
        return this
    }

    fun setNumberOfWindows(numberOfWindows: Int): BedroomBuilder {
        this.numberOfWindows = numberOfWindows
        return this
    }

    fun setNumberOfDoors(numberOfDoors: Int): BedroomBuilder {
        this.numberOfDoors = numberOfDoors
        return this
    }

    fun setIsDouble(isDouble: Boolean): BedroomBuilder {
        this.isDouble = isDouble
        return this
    }

    fun setHasEnsuite(hasEnsuite: Boolean): BedroomBuilder {
        this.hasEnsuite = hasEnsuite
        return this
    }

    fun createBedroom(): Bedroom {
        return Bedroom(
            dimensions,
            ceilingHeight,
            floorNumber,
            wallColor,
            numberOfWindows,
            numberOfDoors,
            isDouble,
            hasEnsuite
        )
    }
}
```

## Execution pattern

```kotlin
object Architect {
    @JvmStatic
    fun main(args: Array<String>) {
        val bedroom = BedroomBuilder()
                        .setCeilingHeight(12)
                        .setFloorNumber(2)
                        .createBedroom();
    }
}
```
