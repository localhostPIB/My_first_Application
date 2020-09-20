package com.oliver.myfirstapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.oliver.myfirstapplication.model.IFernsehSender;
import com.oliver.myfirstapplication.service.SenderplatzService;

public class CreateActivity extends Activity {
   private ConstraintLayout constraintLayoutut;
   private SenderplatzService senderplatzService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        constraintLayoutut = findViewById(R.id.senderhinzufügen);
    }


    private void createEntry(IFernsehSender ifernsehSender){
        senderplatzService = new SenderplatzService();

    }
}
