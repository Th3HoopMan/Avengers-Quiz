package com.example.joseph.avengersquiz;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Joseph on 6/15/2015.
 */
public class CaptainAmericaFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.captain_fragment, container, false);


        Button btn = (Button) view.findViewById(R.id.playagain_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Question1.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
