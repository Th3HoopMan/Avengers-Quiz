package com.example.joseph.avengersquiz;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Joseph on 6/12/2015.
 */
public class ResultPage extends Activity {

     String character;
     Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent prevPage = getIntent();
        Avengers avengers = (Avengers) prevPage.getSerializableExtra("Avengers");

        character = avengers.getCurrentHero();


        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        if (character.equals("Iron Man")) {
            IronManFragment ironManFragment = new IronManFragment();
            fragmentTransaction.replace(android.R.id.content, ironManFragment);


        } else if (character.equals("Thor")) {
            ThorFragment thorFragment = new ThorFragment();
            fragmentTransaction.replace(android.R.id.content, thorFragment);
        } else if (character.equals("Captain America")) {
            CaptainAmericaFragment captainAmericaFragment = new CaptainAmericaFragment();
            fragmentTransaction.replace(android.R.id.content, captainAmericaFragment);
        } else if (character.equals("Hulk")) {
            HulkFragment hulkFragment = new HulkFragment();
            fragmentTransaction.replace(android.R.id.content, hulkFragment);
        } else if (character.equals("Hawk Eye")) {
            HawkEyeFragment hawkEyeFragment = new HawkEyeFragment();
            fragmentTransaction.replace(android.R.id.content, hawkEyeFragment);
        } else if (character.equals("Black Widow")) {
            BlackWidowFragment blackWidowFragment = new BlackWidowFragment();
            fragmentTransaction.replace(android.R.id.content, blackWidowFragment);
        } else if (character.equals("Scarlet Witch")) {
            ScarletWitchFragment scarletWitchFragment = new ScarletWitchFragment();
            fragmentTransaction.replace(android.R.id.content, scarletWitchFragment);
        } else if (character.equals("Quicksilver")) {
            QuicksilverFragment quicksilverFragment = new QuicksilverFragment();
            fragmentTransaction.replace(android.R.id.content, quicksilverFragment);
        } else if (character.equals("Ultron")) {
            UltronFragment ultronFragment = new UltronFragment();
            fragmentTransaction.replace(android.R.id.content, ultronFragment);

        }

        fragmentTransaction.commit();






    }
}
