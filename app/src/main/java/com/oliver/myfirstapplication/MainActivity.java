package com.oliver.myfirstapplication;


import com.oliver.myfirstapplication.model.IFernsehSender;
import com.oliver.myfirstapplication.service.SenderplatzService;
import com.oliver.myfirstapplication.utils.SenderListe;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;


/**
 * MainScreen der Anwendung, zeigt alle Sender an.
 *
 * @version 0.0.1
 */
public class MainActivity extends Activity {
    private SenderListe senderListe;
    private TableRow tableRow;
    private LinearLayout tableLayout;



    /**
     * Wichtig fuer den Start.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableLayout = findViewById(R.id.mainTable);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent(MainActivity.this, CreateActivity.class);
                startActivity(explicitIntent);
            }
        });

        fillIn();
    }

    /**
     * Fuellt die Tabelle mit Werten auf.
     */
    private void fillIn(){
        senderListe = new SenderListe();
        Context ctx = getApplicationContext();
        List<IFernsehSender>  tvList = new SenderplatzService().getAllSender();

        for(IFernsehSender ifernsehSender : tvList){
            tableRow = new TableRow(ctx);
            tableRow.addView(createTextView(ifernsehSender));
            tableLayout.addView(tableRow);
        }
    }

    /**
     * Aufbereitung der View.
     *
     * @param ifernsehSender - Einzelne Werte der Map.
     * @return -     einzelne Reihe der Tabelle.
     */
   private TextView createTextView(IFernsehSender ifernsehSender){
       TextView textView = new TextView(getApplicationContext());
        String row = "\t\t\t" + ifernsehSender.getSendeplatz()
                + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+
                ifernsehSender.getSenderName().toString();

       textView.setText(row);

       return  textView;
   }
    }
