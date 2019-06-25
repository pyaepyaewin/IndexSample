package com.example.indexsample

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import java.security.AccessControlContext

class MainActivity : AppCompatActivity() {
private lateinit var email: String
    companion object{
        fun newIntent(context: Context, email: String): Intent {
            val intent = Intent(context, MainActivity::class.java)
            intent.putExtra(LoginActivity.EMAIL, email)
            return intent

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        extractExtra()
        tvEmail.text=email
    }

    private fun extractExtra()
    {
        val intent=intent
        email=intent.getStringExtra(LoginActivity.EMAIL)!!
    }
}
