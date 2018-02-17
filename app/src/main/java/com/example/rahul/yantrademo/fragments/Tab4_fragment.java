package com.example.rahul.yantrademo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.rahul.yantrademo.R;
import com.example.rahul.yantrademo.adapter.Tab4_Adapter;
import com.example.rahul.yantrademo.adapter.Tab4_Events_Adapter;
import com.example.rahul.yantrademo.adapter.Tab4_RecyclerViewAdapter;

import java.util.ArrayList;
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
    ArrayList<String> months;
    Tab4_RecyclerViewAdapter recyclerViewAdapter;
    Tab4_Events_Adapter events_adapter;
    RecyclerView recyclerView, recyclerView2;

    ArrayList<String> titles,dates,timeAM,timePM,labels,orgNames,addrs,distances;
    ArrayList<Integer> images;


    public Tab4_fragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab4_fragment,container,false);

        linearLayout=(LinearLayout)view.findViewById(R.id.sliderdots);

        recyclerView=(RecyclerView)view.findViewById(R.id.calendarView);
        recyclerView2=(RecyclerView)view.findViewById(R.id.recyclerview_tab4_events);

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

//        /* starts before 1 month from now */
//        Calendar startDate = Calendar.getInstance();
//        startDate.add(Calendar.DATE, -12);
//
///* ends after 1 month from now */
//        Calendar endDate = Calendar.getInstance();
//        endDate.add(Calendar.DATE, 12);
//
//        HorizontalCalendar horizontalCalendar = new HorizontalCalendar.Builder(view,R.id.calendarView)
//                .range(startDate, endDate)
//                .datesNumberOnScreen(5)
//                .configure()
//                .showBottomText(true)
//                .formatMiddleText("MMM")
//                .showTopText(false)
//                .showBottomText(false)
//                .end()
//                .build();
//
//        horizontalCalendar.setCalendarListener(new HorizontalCalendarListener() {
//            @Override
//            public void onDateSelected(Calendar date, int position) {
//                //do something
//                Toast.makeText(getActivity().getApplicationContext(),"date: "+date.getTime()+"\nposition: "+position,Toast.LENGTH_LONG).show();
//            }
//        });

        months=new ArrayList<>();

        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        months.add("May");
        months.add("Jun");
        months.add("Jul");
        months.add("Aug");
        months.add("Sep");
        months.add("Oct");
        months.add("Nov");
        months.add("Dec");

        recyclerViewAdapter=new Tab4_RecyclerViewAdapter(getActivity().getApplicationContext(),months);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity().getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);

        titles=new ArrayList<>();
        dates=new ArrayList<>();
        timeAM=new ArrayList<>();
        timePM=new ArrayList<>();
        labels=new ArrayList<>();
        orgNames=new ArrayList<>();
        addrs=new ArrayList<>();
        distances=new ArrayList<>();
        images=new ArrayList<>();

        titles.add("The Big Bass House Project Ft Droxic");
        titles.add("Sizzling Saturday with DJ Taran");
        titles.add("Belly Dance");
        titles.add("Bollywood Night");
        titles.add("Bollywood Punjabi");
        titles.add("Udita Goswami LIVE!");

        dates.add("Feb 17th");
        dates.add("Feb 18th");
        dates.add("Feb 19th");
        dates.add("Feb 20th");
        dates.add("Feb 22th");
        dates.add("Feb 23th");

        timeAM.add("9:00");
        timeAM.add("10:00");
        timeAM.add("11:00");
        timeAM.add("12:00");
        timeAM.add("8:00");
        timeAM.add("7:00");

        timePM.add("1:00");
        timePM.add("2:00");
        timePM.add("3:00");
        timePM.add("4:00");
        timePM.add("5:00");
        timePM.add("6:00");

        labels.add("DJ night");
        labels.add("Live Music");
        labels.add("Bollywood night");
        labels.add("Punjabi night");
        labels.add("Musical night");
        labels.add("DJ Night");

        addrs.add("Connauhgt Place, New Delhi");
        addrs.add("Rajouri Garden, New Delhi");
        addrs.add("Subhash Nagar, New Delhi");
        addrs.add("Nehru Place, New Delhi");
        addrs.add("Hauz Khaas, New Delhi");
        addrs.add("Shadipur, New Delhi");

        distances.add("2.89");
        distances.add("3.36");
        distances.add("4.51");
        distances.add("5.59");
        distances.add("6.46");
        distances.add("7.66");

        orgNames.add("Local");
        orgNames.add("Moets Stone");
        orgNames.add("Club London");
        orgNames.add("Mafioso");
        orgNames.add("Lord Of The Drinks Chamber");
        orgNames.add("Lord Of The Drinks");

        images.add(R.drawable.im1);
        images.add(R.drawable.im2);
        images.add(R.drawable.im3);
        images.add(R.drawable.im4);
        images.add(R.drawable.im5);
        images.add(R.drawable.im6);

        events_adapter=new Tab4_Events_Adapter(getActivity().getApplicationContext(),titles,dates,timeAM,timePM,labels,orgNames,addrs,distances,images);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView2.setLayoutManager(layoutManager);
        recyclerView2.setAdapter(events_adapter);
        recyclerView2.hasFixedSize();

        return view;
    }
}
