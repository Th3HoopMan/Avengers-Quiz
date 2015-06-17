package com.example.joseph.avengersquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Joseph on 6/12/2015.
 */
public class Question3a1 extends Activity {

    Button answer1, answer2;
    Avengers avengers = new Avengers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question3a1);

        Intent prevPage = getIntent();
        avengers = (Avengers) prevPage.getSerializableExtra("Avengers");

        answer1 = (Button) findViewById(R.id.question3a1_answer1);
        answer2 = (Button) findViewById(R.id.question3a1_answer2);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(0, 2);
                avengers.increaseVotesfor(2, 2);

                Intent intent = new Intent(Question3a1.this, Question4.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(3, 1);
                avengers.increaseVotesfor(4, 1);

                Intent intent = new Intent(Question3a1.this, Question4.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });



    }
}
