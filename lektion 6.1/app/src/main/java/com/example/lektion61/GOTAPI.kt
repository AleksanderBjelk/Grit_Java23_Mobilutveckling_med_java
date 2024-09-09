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

class GOTAPI : AppCompatActivity() {

    lateinit var gotTextview:TextView
    lateinit var actorButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gotapi)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        actorButton = findViewById(R.id.getActorButton)
        gotTextview = findViewById(R.id.gotTextview)

        actorButton.setOnClickListener() {
            Log.i("Aleksander", "onCreate: ")


            var rq: RequestQueue = Volley.newRequestQueue(this)

            var url = "https://anapioficeandfire.com/api/characters/583"

            var request = StringRequest(Request.Method.GET, url, { res ->

                Log.i("Aleksander", "success!!: " + res)
                gotTextview.text = JSONObject(res).getJSONArray("playedBy").get(0).toString()

            }, {
                Log.i("Aleksander", "fail!!: ")

            })

            rq.cache.clear()
            rq.add(request)


        }

    }
}