package com.example.rahul.yantrademo.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.rahul.yantrademo.R;

/**
 * Created by rahul on 14/2/18.
 */

public class Tab4_Adapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;
    Integer[] images={R.drawable.slide7,R.drawable.slide8,R.drawable.slide9};

    public Tab4_Adapter(Context context) {
        this.context = context;
    }



    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.custom_layout_tab1,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.imgViewer_tab1);
        imageView.setImageResource(images[position]);

        ViewPager viewPager=(ViewPager) container;
        viewPager.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager viewPager=(ViewPager)container;
        View view=(View) object;
        viewPager.removeView(view);
    }
}
