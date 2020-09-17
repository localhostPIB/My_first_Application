package com.oliver.myfirstapplication;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MainActivity extends Activity {
   // private final static String[] tvArray = new String[]{"RTL","ARD", "ZDF"};
    private final static Map tvMap = new HashMap<Integer, String>();
    private TableRow tableRow;
    private TableLayout tableLayout;


    static {
        tvMap.put(3, "Sat.1");
        tvMap.put(4, "EuroNews");
        tvMap.put(7, "Pro 7");
        tvMap.put(22 ,"RTL");
        tvMap.put(78, "ZDF");
        tvMap.put(64, "SR");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableLayout = findViewById(R.id.mainTable);


        fillIn();

    }

    private void fillIn(){
        Context ctx = getApplicationContext();
        Iterator i = tvMap.entrySet().iterator();
        while(i.hasNext()){
            tableRow = new TableRow(ctx);
            tableRow.addView(createTextView((Map.Entry) i.next()));
            tableLayout.addView(tableRow);
        }
    }

   private TextView createTextView(Map.Entry text){
       TextView textView = new TextView(getApplicationContext());
        String row = "\t" +text.getKey()
                + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ text.getValue().toString();

       textView.setText(row);

       return  textView;
   }

    }


