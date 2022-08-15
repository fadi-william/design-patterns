package behavioral.state

import behavioral.state.pattern.MediaPlayer

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val mediaPlayer = MediaPlayer()
        mediaPlayer.play()
        mediaPlayer.pause()
    }
}
