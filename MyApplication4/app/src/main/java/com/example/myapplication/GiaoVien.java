package com.example.myapplication;

public class GiaoVien {
    private int ID;
    private String MatKhau, HoTen, Avatar;
    private boolean Status;

    public GiaoVien(){

    }

    public GiaoVien(int ID, String matKhau, String hoTen, String avatar, boolean status) {
        this.ID = ID;
        MatKhau = matKhau;
        HoTen = hoTen;
        Avatar = avatar;
        Status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
}
