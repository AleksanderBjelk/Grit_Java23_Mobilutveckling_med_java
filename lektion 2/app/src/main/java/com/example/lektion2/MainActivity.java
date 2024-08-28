package com.example.lektion2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Aleksander", "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Aleksander", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Aleksander", "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Aleksander", "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Aleksander", "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Aleksander", "onRestart: ");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.textView2);
        ImageView iv = findViewById(R.id.imageViewDroid);

       // tv1.setText(R.string.lang);
        tv1.setText(getResources().getStringArray(R.array.system)[1]);
        tv1.setTextColor(getResources().getColor(R.color.purple));
        //samma sak som ovanför
        tv1.setTextColor(ContextCompat.getColor(MainActivity.this,R.color.purple));

        iv.setAlpha(0.2f);
        iv.setRotationY(170);
        iv.setImageResource(R.drawable.img_1033);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}