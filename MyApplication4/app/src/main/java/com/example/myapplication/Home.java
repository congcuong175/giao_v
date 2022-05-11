package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;


public class Home extends Fragment {
    public static ChipNavigationBar chipNavigationBar;

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }   @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainActivity mainActivity = (MainActivity) getActivity();
        chipNavigationBar = view.findViewById(R.id.menu);
        chipNavigationBar.setItemSelected(R.id._home,true);
        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                switch (i) {
                    case R.id._home:
                        Navigation.findNavController(mainActivity,R.id.nav_host_fragment).navigate(R.id.trang_chu);
                        break;
                        case R.id.lop_hoc:
                        Navigation.findNavController(mainActivity,R.id.nav_host_fragment).navigate(R.id.quan_ly_lophoc);
                        break;
                    case R.id.tai_khoan:
                        Navigation.findNavController(mainActivity,R.id.nav_host_fragment).navigate(R.id.tai_khoan2);
                        break;

                }
            }
        });
    }
}