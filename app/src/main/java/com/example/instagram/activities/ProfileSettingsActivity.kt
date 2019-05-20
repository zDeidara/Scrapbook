package com.example.instagram.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.instagram.R
import com.example.instagram.utils.FirebaseHelper
import kotlinx.android.synthetic.main.activity_profile_settings.*

class ProfileSettingsActivity : AppCompatActivity(){
    private  lateinit var mFirebase: FirebaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_settings)

        mFirebase = FirebaseHelper(this)
        reference.setOnClickListener {  }
        info.setOnClickListener {  }
        sign_out_text.setOnClickListener { mFirebase.auth.signOut() }
        back_image.setOnClickListener { finish() }
    }
}
