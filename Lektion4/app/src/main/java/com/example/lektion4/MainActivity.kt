package com.example.lektion4

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var tv: TextView;
    lateinit var x:Any

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.text)

        //variabler
        var foo = 5
        var bar:Int = 5 //datatypen
        var foo2:String = "hejsan"
        var decimalTal:Float = 0.5f //float
        var doubleTal:Double = 0.10000000001
        var longTal:Long = 1234455234234234L
        var c:Char = 'c'
        var bool:Boolean = false
        var x:Any = arrayOf("h","yo","Aleksander")


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}