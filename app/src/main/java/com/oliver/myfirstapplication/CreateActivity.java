package com.oliver.myfirstapplication;

import com.oliver.myfirstapplication.service.SenderplatzService;

import androidx.constraintlayout.widget.ConstraintLayout;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * View fuer das hinzufuegen eines Tv-Senders.
 */
public class CreateActivity extends Activity {
    private ConstraintLayout constraintLayoutut;
    private SenderplatzService senderplatzService;

    /**
     * Erzeugt die View zum hinzufuegen eines Senders.
     *
     * @param savedInstanceState -
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        constraintLayoutut = findViewById(R.id.senderhinzufügen);
        createEntry();
    }

    /**
     * Fuegt einen Eintrag hinzu.
     */
    private void createEntry() {
        senderplatzService = SenderplatzService.getInstance();

        EditText senderName = (EditText) findViewById(R.id.sendername);
        EditText senderNummer = (EditText) findViewById(R.id.sendeplatz);

        Button button = findViewById(R.id.button2);
        button.setEnabled(false);


        //Prueft ob die Eingaben korrekt sind.
        senderName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() > 0 && senderNummer.getText().toString().trim().length() > 0) {
                    button.setEnabled(true);
                }else{
                    button.setEnabled(false);
                }
            }
        });

        //Prueft ob die Eingaben korrekt sind.
        senderNummer.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() > 0 && senderName.getText().toString().trim().length() > 0) {
                    button.setEnabled(true);
                }else{
                    button.setEnabled(false);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {

            /**
             * Fuegt den Sender hinzu
             * @param v -
             */
            @Override
            public void onClick(View v) {
                senderplatzService.addSender(senderName.getText().toString(),
                        Integer.parseInt(senderNummer.getText().toString()));

                        finish();
            }
        });

    }
}
