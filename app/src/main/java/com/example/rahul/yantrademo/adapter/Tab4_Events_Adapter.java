package com.example.rahul.yantrademo.adapter;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.rahul.yantrademo.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by rahul on 17/2/18.
 */

public class Tab4_Events_Adapter extends RecyclerView.Adapter<Tab4_Events_Adapter.MyViewHolder> {

    Context context;
    ArrayList<String> titles,dates,timeAM,timePM,labels,orgNames,addrs,distances;
    ArrayList<Integer> images;

    public Tab4_Events_Adapter(Context context, ArrayList<String> titles, ArrayList<String> dates, ArrayList<String> timeAM, ArrayList<String> timePM, ArrayList<String> labels, ArrayList<String> orgNames,ArrayList<String> addrs, ArrayList<String> distances, ArrayList<Integer> images) {
        this.context = context;
        this.titles = titles;
        this.dates = dates;
        this.timeAM = timeAM;
        this.timePM = timePM;
        this.labels = labels;
        this.orgNames = orgNames;
        this.addrs=addrs;
        this.distances = distances;
        this.images = images;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.tab4_events_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.textView_title.setText(titles.get(position));
        holder.textView_date.setText(dates.get(position));
        holder.textView_timeAM.setText(timeAM.get(position));
        holder.textView_time_PM.setText(timePM.get(position));
        holder.textView_label.setText(labels.get(position));
        holder.textView_orgName.setText(orgNames.get(position));
        holder.textView_addr.setText(addrs.get(position));
        holder.textView_dist.setText(distances.get(position));

        holder.relativeLayout_parent.setBackgroundDrawable(context.getResources().getDrawable(images.get(position)));


    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {

        CardView cardView;
        TextView textView_title, textView_date, textView_timeAM, textView_time_PM;
        TextView textView_label, textView_orgName, textView_addr, textView_dist;
        RelativeLayout relativeLayout_parent, relativeLayout_dist;

        public MyViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.card1_tab4);
            textView_title=(TextView)itemView.findViewById(R.id.tv_eventName_tab4);
            textView_date=(TextView)itemView.findViewById(R.id.tv_date_tab4);
            textView_timeAM=(TextView)itemView.findViewById(R.id.tv_time_AM_tab4);
            textView_time_PM=(TextView)itemView.findViewById(R.id.tv_time_PM_tab4);
            textView_label=(TextView)itemView.findViewById(R.id.tv_label_tab4);
            textView_orgName=(TextView)itemView.findViewById(R.id.tv_orgName_tab4);
            textView_addr=(TextView)itemView.findViewById(R.id.tv_addr_tab4);
            textView_dist=(TextView)itemView.findViewById(R.id.tv_distance_tab4);
            relativeLayout_parent=(RelativeLayout)itemView.findViewById(R.id.rel3);
            relativeLayout_dist=(RelativeLayout)itemView.findViewById(R.id.rel4);

        }
    }

}
