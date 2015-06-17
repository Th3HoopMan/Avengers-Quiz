package com.example.joseph.avengersquiz;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

import android.text.Layout;
import android.view.View;
import android.widget.RelativeLayout;


public class StartPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.startpage);

        RelativeLayout useMe = (RelativeLayout) findViewById(R.id.startpage_activity);


        useMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartPage.this, Question1.class);

                startActivity(intent);
            }
        });
    }

}



