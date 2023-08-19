package com.ridhamsharma.randomcharacter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var btnAlert: Button?=null
    var etRandom: EditText?= null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAlert = findViewById(R.id.btnAlert)
        etRandom = findViewById(R.id.etRandom)
        btnAlert?.setOnClickListener {
            var btnAlert = AlertDialog.Builder(this)
            .setTitle("Random Character")
            .setMessage("How Many Random Character You Want To Generate")
                .setCancelable(false)
                .setNegativeButton("3"){_,_,->
                    Toast.makeText(this,"Clicked 3",Toast.LENGTH_SHORT).show()
                    for(i in 0..2) {
                        val rand =  ('a'..'z').random()
                        etRandom?.setText(etRandom?.text.toString()+ rand.toString())
                    }
                }
                .setPositiveButton("4"){_,_,->
                    for(i in 0..3) {
                    val rand2 =  ('a'..'z').random()
                        etRandom?.setText(etRandom?.text.toString()+ rand2.toString())
                    }

                }
            btnAlert.show()

        }
    }
}