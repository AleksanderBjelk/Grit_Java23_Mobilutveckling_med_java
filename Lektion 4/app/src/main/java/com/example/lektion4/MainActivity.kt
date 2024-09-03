package com.example.lektion4

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object{
        var defualtColor:String = "#ff00ff"
    }


    private lateinit var tv: TextView;
    public lateinit var x:Any

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

        //final
        val CONST_VALUE:Int = 2000;

        //int x=12,y=2,z=34 (java)
        var y:Int=5; var s:Int=6;

        var ia:IntArray = IntArray(5)
        var ia2:IntArray = intArrayOf(1,2,3,4,5)
        var ba:BooleanArray = BooleanArray(5)
        var ba2:BooleanArray = booleanArrayOf(true,false)
        var sa:Array<String> = arrayOf<String>("hej, tjena")

        if(1<5){
            Log.d("Aleksander", "hej ")
        } else
            Log.d("Aleksander", "hejdå: ")

        Log.d("Aleksander", if (1==1) "hej" else "hejdå")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}