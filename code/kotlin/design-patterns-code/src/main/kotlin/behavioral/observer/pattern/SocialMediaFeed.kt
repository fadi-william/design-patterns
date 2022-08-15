package behavioral.observer.pattern

import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener

class SocialMediaFeed : PropertyChangeListener {

    private val statuses = ArrayList<String>()
    fun printStatuses() {
        statuses.forEach { x: String? -> println(x) }
    }

    override fun propertyChange(evt: PropertyChangeEvent) {
        statuses.add(evt.newValue as String)
    }
}