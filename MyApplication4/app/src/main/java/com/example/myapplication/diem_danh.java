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
        sinhviens.add(new sinhvien("10119432","vuxuanthien2001@gmail.com","0345529591","Vũ Xuân Thiện"));
        sinhviens.add(new sinhvien("10119713","congcuong107@gmail.com","0386328935","Cấn Công Cường"));
        sinhviens.add(new sinhvien("10119064","thanhtonvk@gmail.com","0918273645","Đỗ Thành Tôn"));
        sinhviens.add(new sinhvien("10119204","anhquang@gmail.com","0964396092","Nguyễn Văn Quang"));
        sinhviens.add(new sinhvien("10119608","leeminhthonog@gmail.com","0964396092","Lê Minh Thông"));
        sinhviens.add(new sinhvien("10119239","nqdut1110@gmail.com","0964396092","Nguyễn Quang Duy"));
        sinhviens.add(new sinhvien("10119379","dattran2001@gmail.com","096439645","Trần Huy Đạt"));
        sinhviens.add(new sinhvien("10119122","nghiabro@gmail.com","0964396746","Tô Thiều Minh Nghĩa"));
        sinhviens.add(new sinhvien("10119540","thuanleiatachi@gmail.com","0974582747","Lê Minh Thuận"));
        sinhviens.add(new sinhvien("10119084","cuongchu2k1@gmail.com","09647654381","Chử Văn Cường"));
        sinhviens.add(new sinhvien("10119310","gamplaypnc@gmail.com","0964837281","Phạm Ngọc Chiến"));
        sinhviens.add(new sinhvien("10119657","anthanhmien@gmail.com","0964396736","Nguyễn Văn An"));
        sinhviens.add(new sinhvien("10119065","letoi2001@gmail.com","0964398163","Lê Văn Tới"));
        sinhviens.add(new sinhvien("10119092","dat09@gmail.com","0909090909","Nguyễn Hữu Đạt"));
        sinhviens.add(new sinhvien("10119223","vietai@gmail.com","0954738291","Đoàn Quốc Việt"));
        sinhviens.add(new sinhvien("10119735","toan2001@gmail.com","0954738328","Trần Hà Quốc Toản"));
        sinhviens.add(new sinhvien("10118021","hoamom@gmail.com","0917462811","Dương Xuân Hòa"));
    }
}