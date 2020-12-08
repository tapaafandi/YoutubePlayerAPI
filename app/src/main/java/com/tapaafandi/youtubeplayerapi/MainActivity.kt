package com.tapaafandi.youtubeplayerapi


import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import com.tapaafandi.youtubeplayerapi.databinding.ActivityMainBinding

class MainActivity : YouTubeBaseActivity() {
    private lateinit var myPlayerView: YouTubePlayerView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializePlayer()
    }

    private fun initializePlayer() {
        myPlayerView = findViewById(R.id.youtube_view)
        myPlayerView.initialize("AIzaSyC_4vDgz5M1rowklpZkTIB9Ro3kR9ZugfE", object: YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                if (p1 != null && p2) { p1.play() }
                else {
                    p1!!.loadVideo("VwAnsAUYnw4")
                    p1.play()
                }

            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                TODO("Not yet implemented")
            }

        })



    }
}