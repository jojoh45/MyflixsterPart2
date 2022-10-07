package com.example.myflixsterpart2


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

//FOR THE FRONT PAGE
const val ACTOR_EXTRA = "ACTOR_EXTRA"


class ActorAdapter(private val context: Context, private val actors : List<BestActor>):
    RecyclerView.Adapter<ActorAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.best_actor, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val actor = actors[position]
        holder.bind(actor)
    }


    override fun getItemCount() = actors.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        private val actorImageView = itemView.findViewById<ImageView>(R.id.actor_image2)
        private val actorNameTextView = itemView.findViewById<TextView>(R.id.actor_name2)

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(actor: BestActor){
            actorNameTextView.text = actor.actorName


            Glide.with(context)
                .load("https://image.tmdb.org/t/p/w500/" + actor.actorImageUrl)
                .into(actorImageView)
        }

        override fun onClick(v: View?) {
            val act = actors[absoluteAdapterPosition]

            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(ACTOR_EXTRA, act)
            context.startActivity(intent)
        }
    }

}