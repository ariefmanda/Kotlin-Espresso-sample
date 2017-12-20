package net.pot8os.kotlintestsample

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by ariefmanda on 12/20/17.
 */
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val background = object : Thread() {
            override fun run() {
                try {
                    // Thread will sleep for 5 seconds
                    Thread.sleep((5 * 1000).toLong())

                    // After 5 seconds redirect to another intent
                    val i = Intent(baseContext, MainActivity::class.java)
                    startActivity(i)
                    //Remove activity
                    finish()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        // start thread
        background.start()
    }
}