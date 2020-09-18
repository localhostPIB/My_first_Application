package com.oliver.myfirstapplication;


import com.oliver.myfirstapplication.utils.SenderListe;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.*;

import java.util.Iterator;
import java.util.Map;


public class MainActivity extends Activity {
    private SenderListe senderListe;
    private TableRow tableRow;
    private LinearLayout tableLayout;


    /**
     * wichtig fuer den Start.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableLayout = findViewById(R.id.mainTable);

        fillIn();
    }

    /**
     * Fuellt die Tabelle mit Werten auf.
     */
    private void fillIn(){
        Map tvMap = senderListe.init();
        Context ctx = getApplicationContext();
        Iterator i = tvMap.entrySet().iterator();
        while(i.hasNext()){
            tableRow = new TableRow(ctx);
            tableRow.addView(createTextView((Map.Entry) i.next()));
            tableLayout.addView(tableRow);
        }
    }

    /**
     * Aufbereitung der View.
     *
     * @param text - Einzelne Werte der Map.
     * @return -     einzelne Reihe der Tabelle.
     */
   private TextView createTextView(Map.Entry text){
       TextView textView = new TextView(getApplicationContext());
        String row = "\t\t\t" +text.getKey()
                + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+
                text.getValue().toString();

       textView.setText(row);

       return  textView;
   }
    }
