package com.example.wikipedia.activities

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.wikipedia.R
import com.example.wikipedia.databinding.ActivityDetaileBinding
import com.example.wikipedia.wiki_data

class DetaileActivity : AppCompatActivity() {
    lateinit var binding : ActivityDetaileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetaileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar( binding.detaileActivityToolbar )
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        getData()
        binding.collapsBarMain.setExpandedTitleColor(
            ContextCompat.getColor( this , R.color.white )
        )
        binding.collapsBarMain.setCollapsedTitleTextColor(
            ContextCompat.getColor( this , R.color.white )
        )

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if ( item.itemId == android.R.id.home )
        {
            onBackPressed()
        }

        return true
    }

    fun getData(){
        val data = intent.getParcelableExtra<wiki_data>(SEND_DATA)
        if ( data != null ){
            binding.fabMain.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW , Uri.parse( data.topic_URL ))
                startActivity(intent)
            }
            showData(data)
            Log.v("data" , "Data received")
        }else{
            Log.v("data" , "Data not received")
        }
    }

    private fun showData(data: wiki_data) {
        Glide.with( binding.root ).load( data.imgURL ).into( binding.detaileActivityImage )
        binding.detailActivityTitle.text = data.Title
        binding.detailActivityDetailTxt.text = data.SubTitle
        binding.detaileActivityToolbar.title = data.Title



    }


}