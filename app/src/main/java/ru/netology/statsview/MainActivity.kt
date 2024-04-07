package ru.netology.statsview

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.BounceInterpolator
import android.view.animation.LinearInterpolator
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.netology.statsview.ui.StatsView

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<StatsView>(R.id.stats)
        view.data = listOf(
            500.0F,
            300.0F,
            100.0F,
            500.0F,
        )
//        ObjectAnimator.ofFloat(view, View.ALPHA, 0.25F, 1F).apply {
//            startDelay = 500
//            duration = 300
//            interpolator = BounceInterpolator()
//        }.start()
//        val rotation = PropertyValuesHolder.ofFloat(View.ROTATION, 0F, 360F)
//        val alpha = PropertyValuesHolder.ofFloat(View.ALPHA, 0F, 1F)
//        ObjectAnimator.ofPropertyValuesHolder(view, rotation, alpha)
//            .apply {
//                startDelay = 500
//                duration = 500
//                interpolator = LinearInterpolator()
//            }.start()

//        view.animate()
//            .rotation(360F)
//            .setInterpolator(LinearInterpolator())
//            .setStartDelay(500)
//            .setDuration(1500)
//            .start()


//        val textView = findViewById<TextView>(R.id.label)
//        view.startAnimation(
//            AnimationUtils.loadAnimation(this, R.anim.animation).apply {
//                setAnimationListener(object :Animation.AnimationListener{
//                    override fun onAnimationStart(animation: Animation?) {
//                        textView.text = "onAnimationStart"
//                    }
//
//                    override fun onAnimationEnd(animation: Animation?) {
//                        textView.text = "onAnimationEnd"
//                    }
//
//                    override fun onAnimationRepeat(animation: Animation?) {
//                        textView.text = "onAnimationRepeat"
//                    }
//
//                })
//            }
//        )


    }

}
