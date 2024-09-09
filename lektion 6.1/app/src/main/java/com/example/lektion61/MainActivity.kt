package com.example.lektion61

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    lateinit var tv:TextView
    lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tv = findViewById(R.id.textView)
        btn = findViewById(R.id.button)

        btn.setOnClickListener() {
            Log.i("Aleksander", "onCreate: ")


            var rq: RequestQueue = Volley.newRequestQueue(this)

            var url = "https://italian-jokes.vercel.app/api/jokes"

            var request = StringRequest(Request.Method.GET, url, { res ->

                Log.i("Aleksander", "success!!: " + res)
                tv.text = JSONObject(res).getString("joke")

            }, {
                Log.i("Aleksander", "fail!!: ")

            })

            rq.cache.clear()
            rq.add(request)


        }
    }
}
