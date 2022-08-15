---
name: 3. Prototype
route: /creational/prototype
menu: Creational
---

# Prototype

Helps create a clone of an object that already exists. It is useful when making new objects memory intensive. Cloned objects can be modified. The prototype pattern is also useful when classes are loaded dynamically. Clonning saves memory.

It is implemented using the Clonable interface.

# Sample Code

```kotlin
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
```
