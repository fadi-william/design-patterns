package behavioral.observer.pattern

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

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