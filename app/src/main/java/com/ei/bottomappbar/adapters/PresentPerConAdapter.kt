package com.ei.bottomappbar.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ei.bottomappbar.PresentPerConFrag.*
import com.ei.bottomappbar.frags.LessonFrag

class PresentPerConAdapter(val context: Context,val fm: FragmentManager):FragmentPagerAdapter(fm) {
    val strAry= arrayOf("Lesson","Question1","Question2","Question3","Question4",
        "Question5","Question6","Question7","Question8","Question9","Question10")
    override fun getItem(position: Int): Fragment {
        var frag:Fragment?=null
        when(position){
            0 -> frag=LessonFrag()
            1 -> frag=PPCEx1Frag()
            2 -> frag= PPCEx2Frag()
            3 -> frag= PPCEx3Frag()
            4 -> frag=PPCEx4Frag()
            5 -> frag= PPCEx5Frag()
            6 -> frag=PPCEx6Frag()
            7 -> frag=PPCEx7Frag()
            8 -> frag=PPCEx8Frag()
        }
        return frag!!
    }

    override fun getCount(): Int {
        return strAry.size

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return strAry[position]
    }
}