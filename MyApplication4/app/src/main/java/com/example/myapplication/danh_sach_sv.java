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


public class danh_sach_sv extends Fragment {

    RecyclerView item1,item2;
    danh_sach_sv_Adapter danh_sach_sv_adapter;
    ArrayList<sinhvien>sinhviens;
    ArrayList<Boolean>booleans;
    ArrayList<String>strings;
    check_adapter check_adapter;
    ngay_adapter ngay_adapter;
    public danh_sach_sv() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_danh_sach_sv, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        item1=view.findViewById(R.id.item1);
        item2=view.findViewById(R.id.item2);
        getdata();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        check_adapter=new check_adapter(booleans);
        danh_sach_sv_adapter=new danh_sach_sv_Adapter(sinhviens,check_adapter,getActivity());
        item1.setLayoutManager(new LinearLayoutManager(getContext()));
        item1.setAdapter(danh_sach_sv_adapter);
        danh_sach_sv_adapter.notifyDataSetChanged();
        ngay_adapter=new ngay_adapter(strings);
        item2.setLayoutManager(linearLayoutManager);
        item2.setAdapter(ngay_adapter);
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
        booleans=new ArrayList<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(true);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        booleans.add(true);
        booleans.add(true);
        booleans.add(true);
        booleans.add(true);
        booleans.add(true);
        strings=new ArrayList<>();
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
        strings.add("22/10");
    }
}