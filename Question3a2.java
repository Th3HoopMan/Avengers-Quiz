package com.example.joseph.avengersquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Joseph on 6/12/2015.
 */
public class Question3a2 extends Activity {

    Button answer1, answer2;
    Avengers avengers = new Avengers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question3a2);

        Intent prevPage = getIntent();
        avengers = (Avengers) prevPage.getSerializableExtra("Avengers");

        answer1 = (Button) findViewById(R.id.question3a2_answer1);
        answer2 = (Button) findViewById(R.id.question3a2_answer2);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(0, 1);
                avengers.increaseVotesfor(1, 2);

                Intent intent = new Intent(Question3a2.this, Question4.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(2, 1);
                avengers.increaseVotesfor(4, 2);
                avengers.increaseVotesfor(6, 1);
                avengers.increaseVotesfor(7, 1);

                Intent intent = new Intent(Question3a2.this, Question4.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });



    }
}
