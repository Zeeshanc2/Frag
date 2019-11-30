package com.example.frag;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Frag1 extends Fragment {

    Button sub;

    public Frag1(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag1, container, false);
        sub = view.findViewById(R.id.submit_bt);
        mySub();
        // Inflate the layout for this fragment
        return view;
    }

    public void mySub(){
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Submit button pressed...", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
