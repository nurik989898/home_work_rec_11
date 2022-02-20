package com.example.home_work_rec_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private ArrayList<String> persons;
    private RecyclerView recyclerView;
    private PersonAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recicler_view);
        adapter = new PersonAdapter(persons);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        persons = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            persons.add("Name " + i);

        }
    }
}