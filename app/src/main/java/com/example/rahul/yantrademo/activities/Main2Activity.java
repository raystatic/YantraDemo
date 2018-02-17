package com.example.rahul.yantrademo.activities;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.rahul.yantrademo.R;
import com.example.rahul.yantrademo.adapter.SectionPageAdapter;
import com.example.rahul.yantrademo.fragments.Tab1_fragment;
import com.example.rahul.yantrademo.fragments.Tab2_fragment;
import com.example.rahul.yantrademo.fragments.Tab3_fragment;
import com.example.rahul.yantrademo.fragments.Tab4_fragment;

public class Main2Activity extends AppCompatActivity {

    SectionPageAdapter sectionPageAdapter;
    ViewPager viewPager;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setSubtitleTextColor(Color.WHITE);
        toolbar.setTitleTextColor(Color.WHITE);

        linearLayout=(LinearLayout) findViewById(R.id.main_content);

        viewPager=(ViewPager)findViewById(R.id.container);
        setUpViewPager(viewPager);


        TabLayout tabLayout=(TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


    }





    public void setUpViewPager(ViewPager viewPager)
    {
        sectionPageAdapter=new SectionPageAdapter(getSupportFragmentManager());
        sectionPageAdapter.addFragment(new Tab1_fragment(),"Home");
        sectionPageAdapter.addFragment(new Tab2_fragment(),"Places");
        sectionPageAdapter.addFragment(new Tab3_fragment(),"Deals");
        sectionPageAdapter.addFragment(new Tab4_fragment(),"Events");
        viewPager.setAdapter(sectionPageAdapter);

    }

}
