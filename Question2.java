package com.example.joseph.avengersquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Joseph on 6/11/2015.
 */
public class Question2 extends Activity {
    Button answer1,answer2,answer3;

    Avengers avengers = new Avengers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.question2);

        Intent prevPage = getIntent();
        avengers = (Avengers) prevPage.getSerializableExtra("Avengers");

        answer1 = (Button) findViewById(R.id.q2_answer1);
        answer2 = (Button) findViewById(R.id.q2_answer2);
        answer3 = (Button) findViewById(R.id.q2_answer3);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(0, 1);
                avengers.increaseVotesfor(5, 1);
                avengers.increaseVotesfor(6, 1);

                Intent intent = new Intent(Question2.this, Question2a1.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(1, 1);
                avengers.increaseVotesfor(3, 1);
                avengers.increaseVotesfor(7, 1);

                Intent intent = new Intent(Question2.this, Question2a2.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(2, 1);
                avengers.increaseVotesfor(4, 1);
                avengers.increaseVotesfor(5, 1);
                avengers.increaseVotesfor(6, 1);
                avengers.increaseVotesfor(7, 1);

                Intent intent = new Intent(Question2.this, Question2a3.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });


    }
}
