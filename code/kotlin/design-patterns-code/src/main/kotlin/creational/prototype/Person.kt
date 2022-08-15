package creational.prototype

class Person(var name: String): Cloneable {
    public override fun clone(): Person {
        return try {
            super.clone() as Person
        } catch (e: CloneNotSupportedException) {
            throw AssertionError()
        }
    }
}