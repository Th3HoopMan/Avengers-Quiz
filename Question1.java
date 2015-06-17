package com.example.joseph.avengersquiz;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * Created by Joseph on 6/9/2015.
 */
public class Question1 extends Activity{


    Button answer1,answer2,answer3,answer4;
    Avengers avengers = new Avengers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        avengers.zeroOut();


        setContentView(R.layout.question1);

        answer1 = (Button) findViewById(R.id.q1_answer1);
        answer2 = (Button) findViewById(R.id.q1_answer2);
        answer3 = (Button) findViewById(R.id.q1_answer3);
        answer4 = (Button) findViewById(R.id.q1_answer4);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(0, 1);
                avengers.increaseVotesfor(8, 1);

                Intent intent = new Intent(Question1.this, Question1a1.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(1, 1);
                avengers.increaseVotesfor(2, 1);
                avengers.increaseVotesfor(4, 1);
                avengers.increaseVotesfor(5, 1);

                Intent intent = new Intent(Question1.this, Question1a2.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(3, 1);
                avengers.increaseVotesfor(8, 1);

                Intent intent = new Intent(Question1.this, Question1a3.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(8, 1);

                Intent intent = new Intent(Question1.this, Question2.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });



    }
}
