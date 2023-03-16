package com.example.audiorecorder.playback

import java.io.File

interface AudioPLayer {
    fun playFile(file: File)
    fun stop()
}