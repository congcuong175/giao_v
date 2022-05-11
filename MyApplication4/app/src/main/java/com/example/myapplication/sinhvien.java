package com.example.myapplication;

public class sinhvien {
    String masv,email,sdt,tensv;

    public sinhvien(String masv, String email, String sdt, String tensv) {
        this.masv = masv;
        this.email = email;
        this.sdt = sdt;
        this.tensv = tensv;
    }

    public String getEmail() {
        return email;
    }

    public String getSdt() {
        return sdt;
    }

    public String getMasv() {
        return masv;
    }

    public String getTensv() {
        return tensv;
    }
}
