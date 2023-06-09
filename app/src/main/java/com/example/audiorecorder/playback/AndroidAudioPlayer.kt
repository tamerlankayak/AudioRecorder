package com.example.audiorecorder.playback

import android.content.Context
import android.media.MediaPlayer
import androidx.core.net.toUri
import java.io.File
//creating actions of player
class AndroidAudioPlayer(private val context: Context) : AudioPLayer {
    private var player: MediaPlayer? = null

    override fun playFile(file: File) {
        MediaPlayer.create(context, file.toUri()).apply {
            player = this
            start()
        }
    }

    override fun stop() {
        player?.stop()
        player?.release()
        player = null
    }
}
