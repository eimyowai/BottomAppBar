package com.ei.bottomappbar.frags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ei.bottomappbar.R
import kotlinx.android.synthetic.main.frag_view.*

class Question1:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_view,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvRes.text="what are 1111"
    }
}