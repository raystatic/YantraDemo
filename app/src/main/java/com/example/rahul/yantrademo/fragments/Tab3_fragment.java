package com.example.rahul.yantrademo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahul.yantrademo.R;

/**
 * Created by rahul on 14/2/18.
 */

public class Tab3_fragment extends Fragment {

    public Tab3_fragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab3_fragment,container,false);

        return view;

    }
}
