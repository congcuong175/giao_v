package com.example.myapplication;

public class sinhvien {
    String masv,email,sdt,tensv;
    boolean check;

    public sinhvien(String masv, String email, String sdt, String tensv, boolean check) {
        this.masv = masv;
        this.email = email;
        this.sdt = sdt;
        this.tensv = tensv;
        this.check = check;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
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
