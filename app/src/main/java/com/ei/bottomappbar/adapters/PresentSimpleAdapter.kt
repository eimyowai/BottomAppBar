package com.ei.bottomappbar.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ei.bottomappbar.PSimpleFrag.*
import com.ei.bottomappbar.frags.LessonFrag
import com.ei.bottomappbar.frags.Question1
import com.ei.bottomappbar.frags.Question2

class PresentSimpleAdapter(val context: Context, val fm:FragmentManager) :FragmentPagerAdapter(fm){
    val strArray= arrayOf("Lesson","Question1","Question2","Question3","Question4",
        "Question5","Question6","Question7","Question8","Question9","Question10")
    override fun getItem(position: Int): Fragment {
        var frag : Fragment?=null
        when(position){
            0 -> frag = PSimpleLessonFrag()
            1 -> frag= PSimpleEx1Frag()
            2 -> frag= PSimpleEx2Frag()
            3 -> frag= PSimpleEx3Frag()
            4 -> frag= PSimpleEx4Frag()
            5 -> frag= PSimpleEx5Frag()
            6 -> frag= PSimpleEx6Frag()
            7 -> frag= PSimpleEx7Frag()

        }
        return frag!!
    }

    override fun getCount(): Int {
        return strArray.size

    }
}