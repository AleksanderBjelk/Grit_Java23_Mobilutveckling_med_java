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

    fun aleksander(): Int {
        return 5
    }

    fun merge(vararg array:String ){
        for (x in array)
            Log.d("Aleksander", "loop: "+x)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.text)

        //variabler
        var foo = 1
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
        
        when (foo){
            1 -> {
                Log.d("Aleksander", "onCreate: ")
            }
            2 -> Log.d("Aleksander", "onCreate: ")
            3 -> Log.d("Aleksander", "onCreate: ")
            else -> Log.d("Aleksander", "onCreate: else")
            
        }

        var s3:String = ""
        Log.d("Aleksander", if(s3==="") "YES" else "NO")

        var i = 0
        while( i < 10)
        {
            Log.d("Aleksander", "while ${i}loops")
            //Log.d("Aleksander", "while" + i + " loops")
            i++
        }

        var s4:Array<String> = arrayOf("hej", "he", "yo")
        for (x in s4)
            Log.i("Aleksander", "foreach " + x)


        for (i in 0 .. 10)
        Log.i("Aleksander", "range: " + i)

        for (i in 0 .. 10 step 2) //multiplicerar med 2
            Log.i("Aleksander", "range: " + i)

        for (i in 10 downTo 0) //multiplicerar med 2
            Log.i("Aleksander", "range reverse: " + i)
        merge("hej", "alla", "ihop")


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}