package com.example.frag;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Frag2 extends Fragment {

    Button save;
public Frag2(){

}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag2,container,false);
    save =  view.findViewById(R.id.save_bt);
      mySave();
        // Inflate the layout for this fragment
        return view;
    }

    public void mySave(){
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Save button pressed...", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
