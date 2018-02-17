package com.example.rahul.yantrademo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rahul on 14/2/18.
 */

public class Tab4_RecyclerViewAdapter extends RecyclerView.Adapter<Tab4_RecyclerViewAdapter.MyViewHolder>{

    Context context;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }

}
