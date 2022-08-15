package creational.factory.abstract

class MountainBikeHandlebar : Handlebar() {
    override val description: Unit
        get() {
            println("Mountain bike handlebar. Type: " + type)
        }

    companion object {
        private const val type = "FLAT"
    }
}