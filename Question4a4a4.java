package com.example.joseph.avengersquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Joseph on 6/12/2015.
 */
public class Question4a4a4 extends Activity {

    Button answer1, answer2;
    Avengers avengers = new Avengers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question4a4a4);

        Intent prevPage = getIntent();
        avengers = (Avengers) prevPage.getSerializableExtra("Avengers");

        answer1 = (Button) findViewById(R.id.question4a4a4_answer1);
        answer2 = (Button) findViewById(R.id.question4a4a4_answer2);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(0, 1);
                avengers.increaseVotesfor(8, 2);

                Intent intent = new Intent(Question4a4a4.this, Question5.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avengers.increaseVotesfor(2, 1);
                avengers.increaseVotesfor(6, 2);
                avengers.increaseVotesfor(7, 2);

                Intent intent = new Intent(Question4a4a4.this, Question5.class);
                intent.putExtra("Avengers", avengers);
                startActivity(intent);
            }
        });



    }
}
