package com.example.anbayasiroulette;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by seijiro on 2015/11/11.
 */
public class AnbayasiViewHolder extends RecyclerView.ViewHolder {

    View base;
    TextView textViewNumber;
    TextView textViewComment;

    public AnbayasiViewHolder(View v){
        super(v);
        this.base = v;
        this.textViewNumber = (TextView) v.findViewById(R.id.number);
        this.textViewComment = (TextView) v.findViewById(R.id.comment);
    }

}
