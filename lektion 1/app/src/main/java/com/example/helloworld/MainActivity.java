package com.example.helloworld;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);


            TextView tv = findViewById(R.id.label);
            tv.setText("Jag heter Aleksander");
            tv.setTextSize(26);

            Button b = findViewById(R.id.button);
            b.setText("tryck inte här");



            Button b2 = findViewById(R.id.button2);
            b2.setText("Hej");
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    b2.setText("Hejdå");
                    b2.setBackgroundColor(Color.RED);

                }
            });


            //skriv new och sen O så kommer det upp färdit
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i("Aleksander", "Click!!");

                }
            });

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                b.setBackgroundColor(Color.BLACK);
                b.setText("Nu kommer du att dö");
                b.setTextSize(50);

                }
            });



            Log.println(Log.DEBUG, "Aleksander", "Hello world???");

            Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_LONG).show();


            return insets;
        });
    }
}