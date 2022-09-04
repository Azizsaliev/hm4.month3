package com.example.hm4month3;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {
private ArrayList<Continent> continents;
private onItemClickListener listener;

    public ContinentAdapter(ArrayList<Continent> continents, onItemClickListener listener) {
        this.continents = continents;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
    holder.bind(continents.get(position));
       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
           listener.onItemClick(holder.getAdapterPosition());
           }
       });
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    public Continent getCountry(int position) {
    return continents.get(position);
    }

    static class ContinentViewHolder extends RecyclerView.ViewHolder {
    private TextView tvContent;
    private ImageView tvImg1;

    public ContinentViewHolder(@NonNull View itemView) {
        super(itemView);
    tvContent = itemView.findViewById(R.id.tv_name1);
    tvImg1 = itemView.findViewById(R.id.img_view);
    }
    public void bind(Continent continent){
        tvContent.setText(continent.getName());
        tvImg1.setImageResource(continent.getFlag());
    }
    }

}
