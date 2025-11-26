package com.example.play_store

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AppCompatActivity
import adapter.CategoryAdapter
import model.AppModel
import model.CategoryModel
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvMain: RecyclerView = findViewById(R.id.rvMain)

        val listSuggested = listOf(
            AppModel("Instagram", "4.5", "45 MB", R.drawable.instgram, 0),
            AppModel("Facebook", "4.2", "58 MB", R.drawable.facebook, 0),
            AppModel("Messenger", "4.3", "42 MB", R.drawable.messenger, 0),
            AppModel("TikTok", "4.9", "35 MB", R.drawable.tiktok, 0),
            AppModel("Ms Teams", "4.7", "38 MB", R.drawable.ms_teams, 0),
            AppModel("Zalo", "4.4", "52 MB", R.drawable.zalo, 0)
        )

        // Recommended for you
        val listRecommended = listOf(
            AppModel("Spotify", "4.8", "28 MB", R.drawable.spotify, 1),
            AppModel("Netflix", "4.7", "95 MB", R.drawable.netflix, 1),
            AppModel("YouTube", "4.6", "78 MB", R.drawable.youtube, 1),
            AppModel("Twitter", "4.3", "32 MB", R.drawable.twitter, 1)
        )

        // Category
        val categories = listOf(
            CategoryModel("Suggested for you", listSuggested),
            CategoryModel("Recommended for you", listRecommended),
        )

        // Thiết lập Adapter cho RecyclerView cha (Dọc)
        val categoryAdapter = CategoryAdapter(this, categories)
        rvMain.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvMain.adapter = categoryAdapter
    }
}