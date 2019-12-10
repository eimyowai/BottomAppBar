package com.ei.bottomappbar.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ei.bottomappbar.PastSimpleFrag.*

class PaSimpleAdapter(val context: Context, val fm: FragmentManager) : FragmentPagerAdapter(fm){
    var strAry= arrayOf("Lesson","Question1","Question2","Question3","Question4",
            "Question5","Question6","Question7","Question8","Question9","Question10")
    override fun getItem(position: Int): Fragment {
        var frag: Fragment?=null
        when(position){
            0 -> frag=PaSimpleLessonFrag()
            1-> frag=PaSimpleEx1Frag()
            2 -> frag=PaSimpleEx2Frag()
            3 -> frag= PaSimpleEx3Frag()
            4 -> frag= PaSimpleEx4Frag()
            6 -> frag=PaSimpleEx6Frag()
            7 -> frag=PaSimpleEx7Frag()
            8 -> frag=PaSimpleEx8Frag()
            9 -> frag=PaSimpleEx9Frag()
            10 -> frag=PaSimpleEx10Frag()

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