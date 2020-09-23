package com.oliver.myfirstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.oliver.myfirstapplication.service.SenderplatzService;


/**
 * View fuer das hinzufuegen eines Tv-Senders.
 */
public class CreateActivity extends Activity {
   private ConstraintLayout constraintLayoutut;
   private SenderplatzService senderplatzService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        constraintLayoutut = findViewById(R.id.senderhinzufügen);
        createEntry();
    }


    private void createEntry(){
        senderplatzService = SenderplatzService.getInstance();

         EditText  senderName   = (EditText) findViewById(R.id.sendername);
         EditText  senderNummer = (EditText) findViewById(R.id.sendeplatz);


        Button button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(senderName != null && senderNummer  != null ) {
                    senderplatzService.addSender(senderName.getText().toString(),
                            Integer.parseInt(senderNummer.getText().toString()));
                }
                finish();
            }
        });

    }
}
