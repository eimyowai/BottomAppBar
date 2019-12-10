package com.ei.bottomappbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presentSimple.setOnClickListener {
            val intent = Intent(context@this,PresentSimpleActivity::class.java)
            startActivity(intent)
        }
        presentPerfect.setOnClickListener {
            val intent = Intent(context@this,PresentPerfect::class.java)
            startActivity(intent)
        }
        pastCon.setOnClickListener {
            val intent = Intent(context@this,PastConActivity::class.java)
            startActivity(intent)
        }
        pastSimple.setOnClickListener {
            val intent = Intent(context@this,PaSimpleActivity::class.java)
            startActivity(intent)
        }

    }

    }

