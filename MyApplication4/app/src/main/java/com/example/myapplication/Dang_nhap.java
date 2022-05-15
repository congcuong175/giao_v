package com.example.myapplication;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Dang_nhap extends Fragment {

    public Dang_nhap() {
        // Required empty public constructor
    }

    TextInputEditText edt_account_login, edt_password_login;
    ProgressDialog progressDialog;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edt_account_login = view.findViewById(R.id.edt_account_login);
        edt_password_login = view.findViewById(R.id.edt_password_login);

        view.findViewById(R.id.btn_login_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProgressDialog();
                String taikhoan = edt_account_login.getText().toString();
                String matkhau = edt_password_login.getText().toString();
                ApiService.apiservice.getGiaoVienByID(Integer.parseInt(taikhoan)).enqueue(new Callback<GiaoVien>() {
                    @Override
                    public void onResponse(Call<GiaoVien> call, Response<GiaoVien> response) {
                        progressDialog.cancel();
                        if(response.body() != null){
                            if (response.body().getMatKhau().equals(matkhau)){
                                Navigation.findNavController(view).navigate(R.id.action_blankFragment2_to_blankFragment3);
                            } else {
                                Toast.makeText(getActivity(),"Mật khẩu không chính xác",Toast.LENGTH_LONG).show();
                            }
                        }

                    }

                    @Override
                    public void onFailure(Call<GiaoVien> call, Throwable t) {
                        //Toast.makeText(getActivity(),"Tài khoản không tồn tại",Toast.LENGTH_LONG).show();
                    }
                });

            }
        });
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dang_nhap, container, false);
    }

    private void showProgressDialog(){
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.show();
        progressDialog.setContentView(R.layout.loading);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }
}