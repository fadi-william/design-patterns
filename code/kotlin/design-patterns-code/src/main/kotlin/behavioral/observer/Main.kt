package behavioral.observer

import behavioral.observer.pattern.Connection
import behavioral.observer.pattern.SocialMediaFeed

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
