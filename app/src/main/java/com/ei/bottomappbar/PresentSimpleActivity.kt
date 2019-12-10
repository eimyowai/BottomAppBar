package com.ei.bottomappbar

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

import androidx.appcompat.app.AppCompatActivity

import com.ei.bottomappbar.adapters.PastConAdapter
import com.ei.bottomappbar.adapters.PresentSimpleAdapter

import kotlinx.android.synthetic.main.activity_past_con.*

class PresentSimpleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_past_con)
        val sectionsPagerAdapter = PresentSimpleAdapter(this, supportFragmentManager)

        view_pager.adapter = sectionsPagerAdapter

        tabs.setupWithViewPager(view_pager)
        val fab: FloatingActionButton = findViewById(R.id.fab)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}