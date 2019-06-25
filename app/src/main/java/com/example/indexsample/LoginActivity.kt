package com.example.indexsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
private  lateinit var email:String
    companion object{
        val EMAIL="EMAIL"
    }
    private var password:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            email=editEmail.text.toString()
            password= editPassword.text.toString()
            if(email=="Email.com" && password=="PASSWORD") {
                goToMainActivity()
            }
            else
            {
                Toast.makeText(this,"Login Fail",Toast.LENGTH_LONG).show()

            }


        }

    }
    private fun goToMainActivity()
    {
        startActivity(MainActivity.newIntent(this,email))
        finish()
    }
}
