package com.example.takoyadev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val Button: Button = findViewById(R.id.id_button)
       val email = findViewById(R.id.id_login)
        val password = findViewById(R.id.id_pass)

        val data1 = email.text.toString
        val data2 = password.text.toString()



        // TODO: Faire une premier connexion base de données avec fire base
        



    }


}
        