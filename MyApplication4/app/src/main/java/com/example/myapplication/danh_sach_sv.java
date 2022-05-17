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
        sinhviens.add(new sinhvien("10119096","doquanghao01@gmail.com","0964396091","Đỗ Quang Hào", true));
        sinhviens.add(new sinhvien("10119432","vuxuanthien2001@gmail.com","0345529591","Vũ Xuân Thiện", true));
        sinhviens.add(new sinhvien("10119713","congcuong107@gmail.com","0386328935","Cấn Công Cường", true));
        sinhviens.add(new sinhvien("10119064","thanhtonvk@gmail.com","0918273645","Đỗ Thành Tôn", true));
        sinhviens.add(new sinhvien("10119204","anhquang@gmail.com","0964396092","Nguyễn Văn Quang", true));
        sinhviens.add(new sinhvien("10119608","leeminhthonog@gmail.com","0964396092","Lê Minh Thông", true));
        sinhviens.add(new sinhvien("10119239","nqdut1110@gmail.com","0964396092","Nguyễn Quang Duy", false));
        sinhviens.add(new sinhvien("10119379","dattran2001@gmail.com","096439645","Trần Huy Đạt", false));
        sinhviens.add(new sinhvien("10119122","nghiabro@gmail.com","0964396746","Tô Thiều Minh Nghĩa", false));
        sinhviens.add(new sinhvien("10119540","thuanleiatachi@gmail.com","0974582747","Lê Minh Thuận",true));
        sinhviens.add(new sinhvien("10119084","cuongchu2k1@gmail.com","09647654381","Chử Văn Cường", false));
        sinhviens.add(new sinhvien("10119310","gamplaypnc@gmail.com","0964837281","Phạm Ngọc Chiến", false));
        sinhviens.add(new sinhvien("10119657","anthanhmien@gmail.com","0964396736","Nguyễn Văn An",true));
        sinhviens.add(new sinhvien("10119065","letoi2001@gmail.com","0964398163","Lê Văn Tới", false));
        sinhviens.add(new sinhvien("10119092","dat09@gmail.com","0909090909","Nguyễn Hữu Đạt",true));
        sinhviens.add(new sinhvien("10119223","vietai@gmail.com","0954738291","Đoàn Quốc Việt", false));
        sinhviens.add(new sinhvien("10119735","toan2001@gmail.com","0954738328","Trần Hà Quốc Toản",true));
        sinhviens.add(new sinhvien("10118021","hoamom@gmail.com","0917462811","Dương Xuân Hòa", false));
        booleans=new ArrayList<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);
        strings=new ArrayList<>();
        strings.add("07/02");
        strings.add("14/02");
        strings.add("21/02");
        strings.add("28/02");
        strings.add("07/03");
        strings.add("14/03");
        strings.add("21/03");
        strings.add("28/03");
        strings.add("04/04");
        strings.add("11/04");
        strings.add("18/04");
        strings.add("25/05");
        strings.add("02/05");
        strings.add("09/05");
        strings.add("16/05");
        strings.add("23/05");
    }
}