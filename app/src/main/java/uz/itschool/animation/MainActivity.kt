package uz.itschool.animation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var anim:Animation
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv=findViewById<TextView>(R.id.textView)
        anim=AnimationUtils.loadAnimation(this,R.anim.translate)
        tv.startAnimation(anim)
    }
}