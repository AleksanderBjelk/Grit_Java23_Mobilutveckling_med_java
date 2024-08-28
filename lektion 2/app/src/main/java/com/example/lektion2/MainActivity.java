package com.example.lektion2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;


public class MainActivity extends AppCompatActivity {

    //FragmentManager fm;
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

        //fm = getSupportFragmentManager();

        TextView tv1 = findViewById(R.id.textView2);
        ImageView iv = findViewById(R.id.imageViewDroid);
        Button b = findViewById(R.id.change);
        b.setOnClickListener((e)-> {
            Toast.makeText(MainActivity.this, "byt sida", Toast.LENGTH_LONG).show();
            Intent a2 = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(a2);

        });

    /*    b.setOnClickListener((e)->{
            Toast.makeText(MainActivity.this,"Change Fragments", Toast.LENGTH_LONG);
            tv1.setText(String.valueOf(connected));

            if (fragNumber==1) {
                fm.beginTransaction().add(R.id.fragmentContainerView2, BlankFragment2.class, null).commit();
                fragNumber = 2;
            }else{
                fm.beginTransaction().add(R.id.fragmentContainerView1, BlankFragment2.class, null).commit();
                fragNumber = 1;
            }
        });*/

       // tv1.setText(R.string.lang);
        tv1.setText(getResources().getStringArray(R.array.system)[1]);
        tv1.setTextColor(getResources().getColor(R.color.purple));
        //samma sak som ovanför
        tv1.setTextColor(ContextCompat.getColor(MainActivity.this,R.color.purple));

        iv.setAlpha(0.2f);
        iv.setRotationY(170);
        iv.setImageResource(R.drawable.img_1033);

        Typeface typeface = ResourcesCompat.getFont(this, R.font.gritregular);
        tv1.setTypeface(typeface);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}