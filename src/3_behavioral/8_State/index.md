---
name: 8. State
route: /behavioral/state
menu: Behavioral
---

# State

The state pattern lets an object alter its behavior when its internal state changes. The state pattern can simplify your code by providing an alternative to long if/else blocks or switch statements.

## Code Sample

```kotlin
interface MediaPlayerState {
    fun play(mediaPlayer: MediaPlayer);
    fun pause(mediaPlayer: MediaPlayer);
}
```

```kotlin
class MediaPlayerPlayingState : MediaPlayerState {

    override fun play(mediaPlayer: MediaPlayer) {
        // Do nothing.
    }

    override fun pause(mediaPlayer: MediaPlayer) {
        mediaPlayer.state = MediaPlayerPausingState()
        mediaPlayer.icon = "play button"
        println("Video paused, icon set to ${mediaPlayer.icon}")
    }
}
```

```kotlin
class MediaPlayerPausingState : MediaPlayerState {
    override fun play(mediaPlayer: MediaPlayer) {
        mediaPlayer.state = MediaPlayerPlayingState()
        mediaPlayer.icon = "pause button"
        println("Video playing, icon set to ${mediaPlayer.icon}")
    }

    override fun pause(mediaPlayer: MediaPlayer) {
        // Do nothing.
    }
}
```

```kotlin
class MediaPlayer {
    var state: MediaPlayerState = MediaPlayerPausingState()
    var icon = "play button"

    fun play() {
        state.play(this);
    }

    fun pause() {
        state.pause(this);
    }
}
```

```kotlin
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val mediaPlayer = MediaPlayer()
        mediaPlayer.play()
        mediaPlayer.pause()
    }
}
```