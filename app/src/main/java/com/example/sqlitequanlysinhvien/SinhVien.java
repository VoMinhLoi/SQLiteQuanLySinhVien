package com.example.sqlitequanlysinhvien;

import java.io.Serializable;

public class SinhVien implements Serializable {
    String maSV, tenSV, maLop;

    public SinhVien(String maSV, String tenSV, String maLop) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.maLop = maLop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
}
