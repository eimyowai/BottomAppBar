package com.ei.bottomappbar.frags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ei.bottomappbar.R
import kotlinx.android.synthetic.main.frag_view.*

class LessonFrag:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_view,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvRes.text="         -လက္ရွိ action ကိုေၿပာရင္ V1 သုံး\n" +
                "        - habitual action ဆိုရင္လည္း V1 သုံး\n" +
                "        -always, usually, generally, often, frequently, rarely,\n" +
                "        seldom, every, day, daily, every week, weekly, every year, \n" +
                "        yearly, once a year, etc ပါရင္ present simple သုံး\n" +
                "       - active ဆိုရင္(V1 or V1(s, es)) ===> passive ဆ္ိုရင္(am,is,are + v3)"
    }
}