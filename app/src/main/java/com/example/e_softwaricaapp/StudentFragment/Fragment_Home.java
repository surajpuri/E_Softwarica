package com.example.e_softwaricaapp.StudentFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_softwaricaapp.Adapter.Student_Adapter;
import com.example.e_softwaricaapp.MainActivity;
import com.example.e_softwaricaapp.R;


public class Fragment_Home extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle SavedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_home,container, false);
        recyclerView = view.findViewById(R.id.recyclerview_id);

        Student_Adapter studentAdapter = new Student_Adapter(getContext(), MainActivity.students);
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;

    }
}
