package com.example.wikipedia.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.wikipedia.databinding.TrendsItemBinding
import com.example.wikipedia.wiki_data
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class Trends_recyclerview_adapter(val data: List<wiki_data>, val trendsEvents: Trends_events) :
    RecyclerView.Adapter<Trends_recyclerview_adapter.viewholder>() {


    lateinit var binding: TrendsItemBinding

    inner class viewholder(binding: TrendsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val title = binding.trendsItemTitle
        val subTitle = binding.trendsItemSubTitle
        val img = binding.trendsItemImg

        fun bind_data(item : wiki_data) {

            //transferring click listener to related fragment:
            binding.trendsCardview.setOnClickListener {

                trendsEvents.cardview_clickListner(item)

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
        binding = TrendsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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

    interface Trends_events {
        fun cardview_clickListner( wikiData: wiki_data )
    }


}

