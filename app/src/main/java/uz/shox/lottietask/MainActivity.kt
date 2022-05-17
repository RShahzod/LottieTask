package uz.shox.lottietask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val facebookBtn = findViewById<Button>(R.id.facebookBtn)
        val youtubeBtn = findViewById<Button>(R.id.youtubeBtn)
        val twitterBtn = findViewById<Button>(R.id.twitterBtn)

        facebookBtn.setOnClickListener {
            startActivity(Intent(this,FirstActivity::class.java))
        }
        youtubeBtn.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }
        twitterBtn.setOnClickListener {
            startActivity(Intent(this,ThirdActivity::class.java))
        }


    }
}