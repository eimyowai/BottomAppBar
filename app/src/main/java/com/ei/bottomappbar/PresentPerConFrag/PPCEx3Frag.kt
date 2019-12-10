package com.ei.bottomappbar.PresentPerConFrag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ei.bottomappbar.R
import kotlinx.android.synthetic.main.frag_view.*

class PPCEx3Frag(): Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_view,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvRes.text="      Present Perfect Continuous Tense   " +
                " -တိတ္/ ခု/ ဆက္ ဆိုရင္ present perfect continuous သုံး\n" +
                "           has/have been + ving"
    }
}