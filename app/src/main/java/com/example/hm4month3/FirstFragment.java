package com.example.hm4month3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment implements onItemClickListener {
   private RecyclerView recyclerView;
   private ArrayList<Continent> continents;
   private ContinentAdapter adapter;

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
      recyclerView = view.findViewById(R.id.recycle);
        leadData();
        adapter = new ContinentAdapter(continents, this);
        recyclerView.setAdapter(adapter);
    }


    private void leadData() {
       continents = new ArrayList<>();
       continents.add(new Continent("Asia",R.drawable.ic_group_europe));
        continents.add(new Continent("Africa",R.drawable.ic_group_africa));
        continents.add(new Continent("Europe",R.drawable.ic_group_17));
        continents.add(new Continent("North Africa",R.drawable.ic_group_north));
        continents.add(new Continent("South America",R.drawable.ic_group_africa));
        continents.add(new Continent("Australia",R.drawable.ic_group_aus));
   }


    @Override
    public void onItemClick(int pos) {
        Bundle bundle = new Bundle();
        bundle.putInt("con", pos);
        SecondFragment secondFragment = new SecondFragment();
        secondFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,secondFragment).addToBackStack(null).commit();
    }
}