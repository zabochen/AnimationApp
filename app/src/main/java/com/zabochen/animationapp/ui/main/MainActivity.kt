package com.zabochen.animationapp.ui.main

import android.content.Intent
import android.os.Bundle
import com.zabochen.animationapp.R
import com.zabochen.animationapp.ui.animation.AnimationActivity
import com.zabochen.animationapp.ui.card.CardActivity
import com.zabochen.animationapp.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUi()
    }

    private fun setUi() {
        // Animation Activity
        activityMain_button_animation1.setOnClickListener {
            startActivity(Intent(this, AnimationActivity::class.java))
        }

        // Card Activity
        activityMain_button_animationCard.setOnClickListener {
            startActivity(Intent(this, CardActivity::class.java))
        }
    }
}
