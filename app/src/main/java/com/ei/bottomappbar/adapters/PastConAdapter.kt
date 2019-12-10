package com.ei.bottomappbar.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ei.bottomappbar.PastConFrags.PCEx2Frag
import com.ei.bottomappbar.PastConFrags.PCEx1Frag
import com.ei.bottomappbar.PastConFrags.PCLessonFrag

class PastConAdapter(val context: Context,val fm:FragmentManager) :FragmentPagerAdapter(fm){
    var strAry = arrayOf("Lesson","Question1","Question2","Question3","Question4",
        "Question5","Question6","Question7","Question8","Question9","Question10")
    override fun getCount(): Int {

        return strAry.size

    }

    override fun getItem(position: Int): Fragment {
        var frag : Fragment?=null
        when(position){
            0 -> frag = PCLessonFrag()
            1 -> frag = PCEx1Frag()
            2 -> frag = PCEx2Frag()
            3 -> frag = PCLessonFrag()
            4 -> frag = PCLessonFrag()
            5 -> frag = PCLessonFrag()
            6 -> frag = PCLessonFrag()
            7 -> frag = PCLessonFrag()
            8 -> frag = PCLessonFrag()
            9 -> frag = PCLessonFrag()
            10 -> frag = PCLessonFrag()

        }
        return frag!!
    }
}