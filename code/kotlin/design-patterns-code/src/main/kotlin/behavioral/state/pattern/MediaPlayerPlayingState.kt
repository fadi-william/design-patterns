package behavioral.state.pattern

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
