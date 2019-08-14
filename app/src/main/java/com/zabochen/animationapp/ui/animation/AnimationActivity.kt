package com.zabochen.animationapp.ui.animation

import android.os.Bundle
import android.view.animation.AnimationUtils
import com.zabochen.animationapp.R
import com.zabochen.animationapp.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_animation.*

class AnimationActivity : BaseActivity(R.layout.activity_animation) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUi()
    }

    private fun setUi() {

        // Animations
        val fromTopToBottomAnimation = AnimationUtils.loadAnimation(this, R.anim.top_to_bottom_anim)
        val fromSmallToBigAnimation = AnimationUtils.loadAnimation(this, R.anim.small_to_big_anim)
        val sampleAnimation = AnimationUtils.loadAnimation(this, R.anim.sample_anim)

        // Progress Views
        activityAnimation_textView_progress.startAnimation(fromTopToBottomAnimation)
        activityAnimation_textView_progressDetails.startAnimation(fromTopToBottomAnimation)

        // Images
        activityAnimation_imageView_image.startAnimation(sampleAnimation)
    }
}