package com.mobidev.pickmeup.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.mobidev.pickmeup.R

class PlaceAutoCompleteSearchBarFragment : Fragment() {

    private lateinit var mSlideUp: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mSlideUp = AnimationUtils.loadAnimation(activity, R.anim.transition_slide_up)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_search,container,false)
        return view
    }
}