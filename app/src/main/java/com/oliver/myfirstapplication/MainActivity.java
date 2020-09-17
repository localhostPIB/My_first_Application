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
            tableRow.addView(createTextView(i.next().toString()));
            tableLayout.addView(tableRow);
        }
    }

   private TextView createTextView(String text){
       TextView textView = new TextView(getApplicationContext());
       String rowplace   = text.substring(0,2);
       String rowChannel = text.substring(3);
       String row        ="\t\t"+ rowplace
               + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + rowChannel;

       textView.setText(row);

       return  textView;
   }

    }


