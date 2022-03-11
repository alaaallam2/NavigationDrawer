package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var obj1: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val drawerlayout: DrawerLayout = findViewById(R.id.drawerlayout)
        val navview: NavigationView = findViewById(R.id.navigation)
        obj1 = ActionBarDrawerToggle(
            this, drawerlayout, R.string.draw_open, R.string.draw_close
        )
        drawerlayout.addDrawerListener(obj1)

        obj1.syncState()
        navview.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.favorite -> Toast.makeText(
                    applicationContext,
                    "click favourite",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.our_menu -> Toast.makeText(
                    applicationContext,
                    "click menu",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.home -> Toast.makeText(applicationContext, "click Home", Toast.LENGTH_SHORT)
                    .show()
                R.id.share -> Toast.makeText(applicationContext, "click Share", Toast.LENGTH_SHORT)
                    .show()
                R.id.support -> Toast.makeText(
                    applicationContext,
                    "click support",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.privacy -> Toast.makeText(
                    applicationContext,
                    "click Privacy",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.logout -> Toast.makeText(
                    applicationContext,
                    "click Logout",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.send -> Toast.makeText(
                    applicationContext,
                    "click send",
                    Toast.LENGTH_SHORT
                ).show()
            }
            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (obj1.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}