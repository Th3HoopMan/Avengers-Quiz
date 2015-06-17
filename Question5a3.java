package com.example.joseph.avengersquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Joseph on 6/12/2015.
 */
public class Question5a3 extends Activity {

    Button answer1, answer2, answer3, answer4;
    Avengers avengers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question5a3);

        Intent prevPage = getIntent();
        avengers = (Avengers) prevPage.getSerializableExtra("Avengers");

        answer1 = (Button) findViewById(R.id.question5a3_answer1);
        answer2 = (Button) findViewById(R.id.question5a3_answer2);
        answer3 = (Button) findViewById(R.id.question5a3_answer3);
        answer4 = (Button) findViewById(R.id.question5a3_answer4);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(4, 2);

                Intent intent = new Intent(Question5a3.this, ResultPage.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(5, 2);

                Intent intent = new Intent(Question5a3.this, ResultPage.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(6, 2);

                Intent intent = new Intent(Question5a3.this, ResultPage.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(7, 2);

                Intent intent = new Intent(Question5a3.this, ResultPage.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });



    }
}
