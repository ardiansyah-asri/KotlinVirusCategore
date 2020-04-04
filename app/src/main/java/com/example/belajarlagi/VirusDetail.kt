package com.example.belajarlagi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import com.example.belajarlagi.databinding.ActivityVirusDetailBinding
import kotlinx.android.synthetic.main.activity_virus_detail.*



class VirusDetail : AppCompatActivity() {

    lateinit var binding : ActivityVirusDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_virus_detail)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_virus_detail)
        val actionBar : ActionBar? = supportActionBar
        actionBar !!.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)
        val intent = intent
        val judul = intent.getStringExtra("VIRUSNAME")
        actionBar.setTitle(judul)

   nama_virus.text =  getIntent().getStringExtra("VIRUSNAME")
        detail_virus.text =  getIntent().getStringExtra("VIRUSDETAIL")
        poto.setImageResource(getIntent().getStringExtra("VIRUSLOGO").toInt())

    }

}
