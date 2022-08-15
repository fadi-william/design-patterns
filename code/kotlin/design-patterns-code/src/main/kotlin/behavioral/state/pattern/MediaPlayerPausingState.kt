package behavioral.state.pattern

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