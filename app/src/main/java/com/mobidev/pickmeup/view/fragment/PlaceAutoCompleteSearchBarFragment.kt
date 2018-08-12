package com.mobidev.pickmeup.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.AppCompatEditText
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import butterknife.BindView
import butterknife.ButterKnife
import com.mobidev.pickmeup.R

class PlaceAutoCompleteSearchBarFragment : Fragment() {

    @BindView(R.id.edPickupLocation)
    lateinit var edPickupLocation: AppCompatEditText
    @BindView(R.id.edDestinationLocation)
    lateinit var edDestinationLocation: AppCompatEditText

    private lateinit var mSlideIn: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mSlideIn = AnimationUtils.loadAnimation(activity, R.anim.transition_slide_in)
        mSlideIn.duration = 100

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)
        ButterKnife.bind(this, view)


        return view
    }


    private fun initListeners() {
        mSlideIn.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(animation: Animation?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onAnimationEnd(animation: Animation?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onAnimationStart(animation: Animation?) {
                edPickupLocation.requestFocus()
            }
        })
    }
}