package com.example.rahul.yantrademo.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.example.rahul.yantrademo.R;
import com.example.rahul.yantrademo.adapter.SectionPageAdapter;
import com.example.rahul.yantrademo.fragments.Tab1_fragment;
import com.example.rahul.yantrademo.fragments.Tab2_fragment;

public class MainActivity extends AppCompatActivity {


    SectionPageAdapter sectionPageAdapter;
    ViewPager viewPager;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout=(RelativeLayout)findViewById(R.id.main_content);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager=(ViewPager)findViewById(R.id.container);
        setUpViewPager(viewPager);

//         tabLayout=(TableLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id==R.id.exit_main)
        {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void setUpViewPager(ViewPager viewPager)
    {
        sectionPageAdapter=new SectionPageAdapter(getSupportFragmentManager());
        sectionPageAdapter.addFragment(new Tab1_fragment(),"Home");
        sectionPageAdapter.addFragment(new Tab2_fragment(),"Places");
        viewPager.setAdapter(sectionPageAdapter);

    }
}
