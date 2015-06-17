package com.example.joseph.avengersquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Joseph on 6/12/2015.
 */
public class Question5 extends Activity {

    Button answer1, answer2, answer3, answer4, answer5;
    Avengers avengers = new Avengers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question5);

        Intent prevPage = getIntent();
        avengers = (Avengers) prevPage.getSerializableExtra("Avengers");

        answer1 = (Button) findViewById(R.id.q5_answer1);
        answer2 = (Button) findViewById(R.id.q5_answer2);
        answer3 = (Button) findViewById(R.id.q5_answer3);
        answer4 = (Button) findViewById(R.id.q5_answer4);
        answer5 = (Button) findViewById(R.id.q5_answer5);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(2, 2);

                Intent intent = new Intent(Question5.this, Question5a1.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(0, 1);
                avengers.increaseVotesfor(3, 1);

                Intent intent = new Intent(Question5.this, Question5a2.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(4, 1);
                avengers.increaseVotesfor(5, 1);
                avengers.increaseVotesfor(6, 1);
                avengers.increaseVotesfor(7, 1);

                Intent intent = new Intent(Question5.this, Question5a3.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(1, 2);
                avengers.increaseVotesfor(3, 2);

                Intent intent = new Intent(Question5.this, Question5a4.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(8, 3);

                Intent intent = new Intent(Question5.this, ResultPage.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });


    }
}
