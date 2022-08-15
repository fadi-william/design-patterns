package creational.builder

import java.awt.Color
import java.awt.Dimension

class RoomBuilder {
    private var dimensions: Dimension? = null
    private var ceilingHeight = 0
    private var floorNumber = 0
    private var wallColor: Color? = null
    private var numberOfWindows = 0
    private var numberOfDoors = 0
    private var roomListBuilder: RoomListBuilder? = null

    constructor() {}
    
    constructor(roomListBuilder: RoomListBuilder?) {
        this.roomListBuilder = roomListBuilder
    }

    fun setDimensions(dimensions: Dimension?): RoomBuilder {
        this.dimensions = dimensions
        return this
    }

    fun setCeilingHeight(ceilingHeight: Int): RoomBuilder {
        this.ceilingHeight = ceilingHeight
        return this
    }

    fun setFloorNumber(floorNumber: Int): RoomBuilder {
        this.floorNumber = floorNumber
        return this
    }

    fun setWallColor(wallColor: Color?): RoomBuilder {
        this.wallColor = wallColor
        return this
    }

    fun setNumberOfWindows(numberOfWindows: Int): RoomBuilder {
        this.numberOfWindows = numberOfWindows
        return this
    }

    fun setNumberOfDoors(numberOfDoors: Int): RoomBuilder {
        this.numberOfDoors = numberOfDoors
        return this
    }

    fun createRoom(): Room {
        return Room(dimensions!!, ceilingHeight, floorNumber, wallColor!!, numberOfWindows, numberOfDoors)
    }

    fun addRoomToList(): RoomListBuilder {
        val room = createRoom()
        roomListBuilder?.addRoom(room)
        return roomListBuilder!!
    }
}