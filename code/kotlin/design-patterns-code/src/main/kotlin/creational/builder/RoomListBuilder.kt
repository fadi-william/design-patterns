package creational.builder

class RoomListBuilder {
    private lateinit var listOfRooms: ArrayList<Room>

    fun addList(): RoomListBuilder {
        listOfRooms = ArrayList<Room>()
        return this
    }

    fun addRoom(room: Room): RoomListBuilder {
        listOfRooms.add(room)
        return this
    }

    fun addRoom(): RoomBuilder {
        return RoomBuilder(this)
    }

    fun buildList(): ArrayList<Room> {
        return listOfRooms
    }
}