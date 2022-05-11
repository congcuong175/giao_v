package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Trang_chu extends Fragment {
    RecyclerView item2;
    lich_hoc_Adapter lich_hoc_adapter;
    ArrayList<lich_hoc>lich_hocs;
    public Trang_chu() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trang_chu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        item2=view.findViewById(R.id.item2);
        lich_hocs=new ArrayList<>();
        getdata();
        lich_hoc_adapter=new lich_hoc_Adapter(lich_hocs,Trang_chu.this);
        item2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        item2.setAdapter(lich_hoc_adapter);

    }

    private void getdata() {

        lich_hocs.add(new lich_hoc("101195","Đại số tuyến tính","1-4"));
        lich_hocs.add(new lich_hoc("101195","Đại số tuyến tính","1-4"));
        lich_hocs.add(new lich_hoc("101195","Đại số tuyến tính","1-4"));
        lich_hocs.add(new lich_hoc("101195","Đại số tuyến tính","1-4"));
        lich_hocs.add(new lich_hoc("101195","Đại số tuyến tính","1-4"));
    }
}