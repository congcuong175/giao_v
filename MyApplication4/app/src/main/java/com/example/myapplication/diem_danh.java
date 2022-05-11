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


public class diem_danh extends Fragment {
    RecyclerView item1;
    sinhvien_adapter sinhvien_adapter;
    ArrayList<sinhvien>sinhviens;
    public diem_danh() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_diem_danh, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        item1=view.findViewById(R.id.item1);
        getdata();
        sinhvien_adapter=new sinhvien_adapter(sinhviens);
        item1.setLayoutManager(new LinearLayoutManager(getContext()));
        item1.setAdapter(sinhvien_adapter);
        sinhvien_adapter.notifyDataSetChanged();
    }

    private void getdata() {
        sinhviens=new ArrayList<>();
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào"));
    }
}