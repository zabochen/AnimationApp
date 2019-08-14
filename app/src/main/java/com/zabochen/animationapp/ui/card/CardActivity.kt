package com.zabochen.animationapp.ui.card

import android.animation.AnimatorInflater
import android.os.Bundle
import com.zabochen.animationapp.R
import com.zabochen.animationapp.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_card.*

// https://github.com/DroidsOnRoids/FlipAnimation-Android
class CardActivity : BaseActivity(R.layout.activity_card) {

    private var backVisibleState: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cards
        val frontCard = activityCard_front
        val backCard = activityCard_back

        // Animation
        val inAnimation = AnimatorInflater.loadAnimator(this, R.animator.in_animation)
        val outAnimation = AnimatorInflater.loadAnimator(this, R.animator.out_animation)

        // Cards holder
        activityCard_holder.setOnClickListener {
            if (!backVisibleState) {
                outAnimation.setTarget(frontCard)
                inAnimation.setTarget(backCard)
                outAnimation.start()
                inAnimation.start()
                backVisibleState = true
            } else {
                outAnimation.setTarget(backCard)
                inAnimation.setTarget(frontCard)
                outAnimation.start()
                inAnimation.start()
                backVisibleState = false
            }
        }
    }
}