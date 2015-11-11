package com.example.anbayasiroulette;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by seijiro on 2015/11/11.
 */
public class AnbayasiAdapter extends RecyclerView.Adapter<AnbayasiViewHolder> {
    private ArrayList<AnbayasiData> rouletteDataSet;

    public AnbayasiAdapter(ArrayList<AnbayasiData> ro){
        this.rouletteDataSet = ro;
    }

    @Override
    public AnbayasiViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_layout,parent,false);
        return new AnbayasiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AnbayasiViewHolder holder,final int listPosition){
        holder.textViewNumber.setText( rouletteDataSet.get(listPosition).getNumber() + "本");
        holder.textViewComment.setText( rouletteDataSet.get(listPosition).getComment());
        holder.base.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"おまけ"+ rouletteDataSet.get(listPosition).getAddition() + "本"
                ,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return rouletteDataSet.size();
    }
}
