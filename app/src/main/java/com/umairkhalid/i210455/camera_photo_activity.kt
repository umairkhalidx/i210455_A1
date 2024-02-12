package com.umairkhalid.i210455

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class camera_photo_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.camera_photo)


        val close_btn: ImageButton =findViewById(R.id.close_btn)
        val video_btn: Button =findViewById(R.id.video_btn)

        video_btn.setOnClickListener{
            val nextActivityIntent = Intent(this, camera_video_activity::class.java)
            startActivity(nextActivityIntent)
            finish()
        }

        close_btn.setOnClickListener{
//            val nextActivityIntent = Intent(this, home_page_activity::class.java)
//            startActivity(nextActivityIntent)
            onBackPressed()
            finish()
        }
    }
}