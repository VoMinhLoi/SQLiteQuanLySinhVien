package com.example.sqlitequanlysinhvien;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {
    List<SinhVien> sinhVienList;
    Activity activity;

    public SinhVienAdapter(ListSinhVien sinhVienList, Activity activity) {
        this.sinhVienList = sinhVienList.getSinhVienList();
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return sinhVienList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.activity_custom_sinhvien, null);
        TextView maSVTVAX = view.findViewById(R.id.maSVTV);
        TextView tenSVTVAX = view.findViewById(R.id.tenSVTV);
        TextView maLopSVTVAX = view.findViewById(R.id.maLopSVTV);
        SinhVien sinhVien = sinhVienList.get(i);
        maSVTVAX.setText(sinhVien.getMaLop());
        tenSVTVAX.setText(sinhVien.getTenSV());
        maLopSVTVAX.setText(sinhVien.getMaLop());
        return view;
    }
}
