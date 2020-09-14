package com.oliver.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1    = findViewById(R.id.button2);
       final TextView text      = findViewById(R.id.text1) ;


        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                text.setText("Lets Go !!!");

            }
        });
    }


}