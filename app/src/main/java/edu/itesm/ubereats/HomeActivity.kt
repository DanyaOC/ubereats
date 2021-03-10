package edu.itesm.ubereats

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        object : CountDownTimer(4000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                mensaje.setText(" " + millisUntilFinished / 1000)
            }
            override fun onFinish() {
                mensaje.setText("App Uber eats")

            }

        }.start()
        Handler().postDelayed({
            val intento=Intent(this,MainActivity::class.java)
            startActivity(intento)
            finish()
        },4000)
    }
}