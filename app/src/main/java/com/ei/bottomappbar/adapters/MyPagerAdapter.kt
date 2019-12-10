package com.ei.bottomappbar.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ei.bottomappbar.frags.LessonFrag
import com.ei.bottomappbar.frags.Question1
import com.ei.bottomappbar.frags.Question2

class MyPagerAdapter(val context: Context,val fm:FragmentManager) :FragmentPagerAdapter(fm){
    val strArray= arrayOf("Lesson","Question1","Question2")
    override fun getItem(position: Int): Fragment {
        var frag : Fragment?=null
        when(position){
            0 -> frag = LessonFrag()
            1 -> frag= Question1()
            2 -> frag= Question2()

        }
        return frag!!
    }

    override fun getCount(): Int {
        return strArray.size

    }
}