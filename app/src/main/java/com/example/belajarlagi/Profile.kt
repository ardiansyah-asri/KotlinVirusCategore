package com.example.belajarlagi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import kotlin.system.exitProcess

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val actionBar : ActionBar ? = supportActionBar
        actionBar !!.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)
        actionBar.setTitle("Profil Saya")
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.keluar_bar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.keluar){
            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()

            moveTaskToBack(true)
            exitProcess(-1)
        }
        return super.onOptionsItemSelected(item)
    }
}
