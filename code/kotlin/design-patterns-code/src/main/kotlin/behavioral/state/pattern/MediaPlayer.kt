package behavioral.state.pattern

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