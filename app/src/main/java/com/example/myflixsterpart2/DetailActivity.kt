package com.example.myflixsterpart2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "DetailActivity"
//FOR THE SECOND PAGE


class DetailActivity : AppCompatActivity() {
    private lateinit var actorImageView: ImageView
    private lateinit var movieImageView: ImageView
    private lateinit var actorNameTextView: TextView
    private lateinit var knownForTextView: TextView
    private lateinit var overviewTextView: TextView

    override fun onCreate(savedInstaceState: Bundle?) {
        super.onCreate(savedInstaceState)
        setContentView(R.layout.actor_detail)

        actorImageView = findViewById(R.id.actor_image2)
        actorNameTextView = findViewById(R.id.actor_name2)
        knownForTextView = findViewById(R.id.Know_for)
        overviewTextView = findViewById(R.id.OverView)
        movieImageView = findViewById(R.id.movie_image)


        val actor = intent.getSerializableExtra(ACTOR_EXTRA) as BestActor
        val kf = KnownFor()


        actorNameTextView.text = actor.actorName
        knownForTextView.text = kf.original_title
        overviewTextView.text = kf.overview


        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500/" + actor.actorImageUrl)
            .centerCrop()
            .into(actorImageView)
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500/" + kf.backdrop_path)
            .into(movieImageView)
    }

}