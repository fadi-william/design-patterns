package creational.builder

object Architect {
    @JvmStatic
    fun main(args: Array<String>) {

        val rooms: ArrayList<Room> = RoomListBuilder().addList()
            .addRoom().setFloorNumber(2).addRoomToList()
            .addRoom().setFloorNumber(1).addRoomToList()
            .buildList()

        val house = House(rooms)
    }
}
