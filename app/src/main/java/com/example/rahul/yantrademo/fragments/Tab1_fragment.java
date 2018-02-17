package com.example.rahul.yantrademo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.rahul.yantrademo.R;
import com.example.rahul.yantrademo.adapter.Tab4_Adapter;

/**
 * Created by rahul on 20/1/18.
 */

public class Tab1_fragment extends android.support.v4.app.Fragment {


    public Tab1_fragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab1_fragment,container,false);



        return view;
    }
}
