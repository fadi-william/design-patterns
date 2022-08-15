package behavioral.state.pattern

interface MediaPlayerState {
    fun play(mediaPlayer: MediaPlayer);
    fun pause(mediaPlayer: MediaPlayer);
}
