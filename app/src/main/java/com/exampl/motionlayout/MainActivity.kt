package com.example.motionlayout

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import com.exampl.motionlayout.R
import com.exampl.motionlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val moveUpAnimation = AnimationUtils.loadAnimation(this, R.anim.move_up_animation)
        val ivFirstCircle = binding.ivFirstCircle
        val ivSecondCircle = binding.ivSecondCircle
        val ivThirdCircle = binding.ivThirdCircle
        val ivFourthCircle = binding.ivFourthCircle
        val ivMainLogo = binding.ivLogo

        val halfHeight = ivFirstCircle.height / 2 // Calculate half of the ImageView's height
        ivFirstCircle.translationY = -halfHeight.toFloat()
        ivFirstCircle.startAnimation(moveUpAnimation)

        ivSecondCircle.translationY = -halfHeight.toFloat()
        ivSecondCircle.startAnimation(moveUpAnimation)

        ivThirdCircle.translationY = -halfHeight.toFloat()
        ivThirdCircle.startAnimation(moveUpAnimation)

        ivFourthCircle.translationY = -halfHeight.toFloat()
        ivFourthCircle.startAnimation(moveUpAnimation)

    }
}