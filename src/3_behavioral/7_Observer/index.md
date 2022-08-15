---
name: 7. Observer
route: /behavioral/observer
menu: Behavioral
---

# Observer

The oberser is used to act upon properties change of the observable or subjects objects.

## Sample Code

```kotlin
class Connection {
    private var status = ""
    private var support = PropertyChangeSupport(this)

    fun setStatus(status: String) {
        this.support.firePropertyChange("status", this.status, status)
        this.status = status
    }

    fun addPropertyChangeListener(propertyChangeListener: PropertyChangeListener) {
        support.addPropertyChangeListener(propertyChangeListener)
    }
}
```

```kotlin
class SocialMediaFeed : PropertyChangeListener {

    private val statuses = ArrayList<String>()
    fun printStatuses() {
        statuses.forEach { x: String? -> println(x) }
    }

    override fun propertyChange(evt: PropertyChangeEvent) {
        statuses.add(evt.newValue as String)
    }
}
```

```kotlin
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val sally = Connection()
        val bob = Connection()

        val feed = SocialMediaFeed()
        sally.addPropertyChangeListener(feed)
        bob.addPropertyChangeListener(feed)

        sally.setStatus("going for a walk")
        bob.setStatus("eating my lunch")

        feed.printStatuses()
    }
}
```