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


public class quan_ly_lophoc extends Fragment {

    RecyclerView item2;
    lop_hoc_Adapter lop_hoc_adapter;
    ArrayList<lop_hoc> lop_hocs;
    public quan_ly_lophoc() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quan_ly_lophoc, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        item2=view.findViewById(R.id.item2);
        lop_hocs=new ArrayList<>();
        getdata();
        lop_hoc_adapter=new lop_hoc_Adapter(lop_hocs,quan_ly_lophoc.this);
        item2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        item2.setAdapter(lop_hoc_adapter);

    }

    private void getdata() {

        lop_hocs.add(new lop_hoc("101195","CNTT","2020-2021"));
        lop_hocs.add(new lop_hoc("101195","CNTT","2020-2021"));
        lop_hocs.add(new lop_hoc("101195","CNTT","2020-2021"));
        lop_hocs.add(new lop_hoc("101195","CNTT","2020-2021"));
        lop_hocs.add(new lop_hoc("101195","CNTT","2020-2021"));
        lop_hocs.add(new lop_hoc("101195","CNTT","2020-2021"));

    }
}