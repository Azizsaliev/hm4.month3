package com.example.hm4month3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Country> countries;
    private int continate;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_secon, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycle2);
        if (getArguments()!=null){
            continate = getArguments().getInt("con");
        }
        leadData();

    }
    private void leadData() {
        countries = new ArrayList<>();
        switch (continate){
            case 0:
                countries.add(new Country("Turkey", R.drawable.ic_turkey));
                countries.add(new Country("Turkmenistan", R.drawable.ic_tm));
                countries.add(new Country("kazakhstan", R.drawable.ic_kz));
                countries.add(new Country("Uzbekistan", R.drawable.ic_uzb));
                countries.add(new Country("Kyrgyzstan", R.drawable.ic_kg));
                break;
            case 1:
                countries.add(new Country("Libya", R.drawable.ic_group_libya));
                countries.add(new Country("Kenya", R.drawable.ic_group_kenya));
                countries.add(new Country("Nigeria", R.drawable.ic_group_nigeria));
                countries.add(new Country("Egypt", R.drawable.ic_group_egypt));
                countries.add(new Country("Tunisia", R.drawable.ic_group_tunissia));
                break;
            case 2:
                countries = new ArrayList<>();
                countries.add(new Country("Germany", R.drawable.ic_group_germany));
                countries.add(new Country("Italy", R.drawable.ic_group_italy));
                countries.add(new Country("France", R.drawable.ic_group_france));
                countries.add(new Country("Ukraine", R.drawable.ic_group_ukraine));
                countries.add(new Country("Spain", R.drawable.ic_group_spain));
                break;
            case 3:
                countries = new ArrayList<>();
                countries.add(new Country("Algeria",R.drawable.ic_group_algeria));
                countries.add(new Country("Morocco",R.drawable.ic_group_morocco));
                countries.add(new Country("Tunisia",R.drawable.ic_group_tunissia));
                countries.add(new Country("Sudan",R.drawable.ic_group_sudan));
                countries.add(new Country("Libya",R.drawable.ic_group_libya));
                break;
            case 4:
                countries = new ArrayList<>();
                countries.add(new Country("Argentina",R.drawable.ic_group_argentina));
                countries.add(new Country("Brazil",R.drawable.ic_group_brazil));
                countries.add(new Country("Colombia",R.drawable.ic_group_colombia));
                countries.add(new Country("Ecuador",R.drawable.ic_group_ecuador));
                countries.add(new Country("Panama",R.drawable.ic_group_panama));
                break;
            case 5:
                countries = new ArrayList<>();
                countries.add(new Country("Tasmania",R.drawable.ic_group_38));
                countries.add(new Country("Oceania",R.drawable.ic_group_38));
                countries.add(new Country("Megadiverse",R.drawable.ic_group_38));
                countries.add(new Country("Canberra",R.drawable.ic_group_38));
                countries.add(new Country("Australia",R.drawable.ic_group_38));
                break;
        }

        CountryAdapter adapter = new CountryAdapter(countries);
        recyclerView.setAdapter(adapter);
    }

}