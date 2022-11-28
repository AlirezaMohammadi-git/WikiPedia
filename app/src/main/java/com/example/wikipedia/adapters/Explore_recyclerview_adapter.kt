package com.example.wikipedia.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.wikipedia.databinding.ExploreItemBinding
import com.example.wikipedia.wiki_data
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class Explore_recyclerview_adapter(val data: List<wiki_data>, val explore_events: Explore_events) :
    RecyclerView.Adapter<Explore_recyclerview_adapter.viewholder>() {

    lateinit var binding: ExploreItemBinding

    inner class viewholder(binding: ExploreItemBinding) : RecyclerView.ViewHolder(binding.root) {

        val title = binding.exploreItemTitle
        val subTitle = binding.exploreItemSubTitle
        val img = binding.exploreItemImg


        fun bind_data(item: wiki_data) {

            //transferring click listener to related fragment:
            binding.exploreCardview.setOnClickListener {

                explore_events.cardview_clickListener(item)

            }
            title.text = item.Title.toString()
            subTitle.text = item.SubTitle.toString()
            Glide
                .with(binding.root.context)
                .load(item.imgURL)
                .transform(RoundedCornersTransformation(10, 2))
                .into(img)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        binding = ExploreItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return viewholder(binding)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {

        val item = wiki_data(
            data[position].Title,
            data[position].SubTitle,
            data[position].imgURL,
            data[position].topic_URL
        )

        holder.bind_data(item)
    }

    override fun getItemCount(): Int {
        return data.size
    }


    interface Explore_events {
        fun cardview_clickListener(wikiData: wiki_data)
    }


}