package com.example.rahul.yantrademo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.rahul.yantrademo.R;
import com.example.rahul.yantrademo.adapter.Tab4_Adapter;

import java.util.Calendar;

import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarListener;

/**
 * Created by rahul on 14/2/18.
 */

public class Tab4_fragment extends Fragment {

    ViewPager viewPager;
    LinearLayout linearLayout;
    int dotscount;
    ImageView[] dots;

    public Tab4_fragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab4_fragment,container,false);

        linearLayout=(LinearLayout)view.findViewById(R.id.sliderdots);

        viewPager=(ViewPager)view.findViewById(R.id.viewpager_tab1);
        Tab4_Adapter adapter=new Tab4_Adapter(getActivity().getApplicationContext());
        viewPager.setAdapter(adapter);

        dotscount=adapter.getCount();
        dots=new ImageView[dotscount];
        for (int i=0; i<dotscount; i++)
        {
            dots[i]=new ImageView(getActivity().getApplicationContext());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(),R.drawable.non_active_dot));
            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8,0,8,0);

            linearLayout.addView(dots[i],params);
        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(),R.drawable.active_dot));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0; i<dotscount; i++)
                {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(),R.drawable.non_active_dot));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(),R.drawable.active_dot));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        /* starts before 1 month from now */
        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.MONTH, -1);

/* ends after 1 month from now */
        Calendar endDate = Calendar.getInstance();
        endDate.add(Calendar.MONTH, 1);

        HorizontalCalendar horizontalCalendar = new HorizontalCalendar.Builder(view,R.id.calendarView)
                .range(startDate, endDate)
                .datesNumberOnScreen(5)
                .build();

        horizontalCalendar.setCalendarListener(new HorizontalCalendarListener() {
            @Override
            public void onDateSelected(Calendar date, int position) {
                //do something
                Toast.makeText(getActivity().getApplicationContext(),"date: "+date.getTime()+"\nposition: "+position,Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
