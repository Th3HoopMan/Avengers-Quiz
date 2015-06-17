package com.example.joseph.avengersquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Joseph on 6/12/2015.
 */
public class Question3 extends Activity {

    Button answer1, answer2, answer3, answer4;
    Avengers avengers = new Avengers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question3);

        Intent prevPage = getIntent();
        avengers = (Avengers) prevPage.getSerializableExtra("Avengers");

        answer1 = (Button) findViewById(R.id.q3_answer1);
        answer2 = (Button) findViewById(R.id.q3_answer2);
        answer3 = (Button) findViewById(R.id.q3_answer3);
        answer4 = (Button) findViewById(R.id.q3_answer4);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(0, 1);
                avengers.increaseVotesfor(3, 1);

                Intent intent = new Intent(Question3.this, Question3a1.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(1, 2);
                avengers.increaseVotesfor(2, 2);
                avengers.increaseVotesfor(4, 1);

                Intent intent = new Intent(Question3.this, Question3a2.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(8, 1);

                Intent intent = new Intent(Question3.this, Question4.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(3, 2);
                avengers.increaseVotesfor(5, 2);

                Intent intent = new Intent(Question3.this, Question3a4.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });


    }
}
