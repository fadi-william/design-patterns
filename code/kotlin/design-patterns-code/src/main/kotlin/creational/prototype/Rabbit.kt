package creational.prototype

class Rabbit : Cloneable {
    enum class Breed {
        HIMALAYAN, AMERICAN, MINI_REX, LIONHEAD, DUTCH
    }

    var age = 0
    var breed: Breed? = null
    var owner: Person? = null
        private set

    fun setOwner(name: String?) {
        val owner = Person(name!!)
        this.owner = owner
    }

    public override fun clone(): Rabbit {
        return try {
            val rabbit = super.clone() as Rabbit
            rabbit.owner = owner!!.clone()
            rabbit
        } catch (e: CloneNotSupportedException) {
            throw AssertionError()
        }
    }
}