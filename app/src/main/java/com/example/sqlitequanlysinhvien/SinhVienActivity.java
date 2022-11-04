package com.example.sqlitequanlysinhvien;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SinhVienActivity extends AppCompatActivity {
    ListSinhVien listSinhVien;
    SinhVienAdapter sinhVienAdapter;
    ListView sinhVienLVAX;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinhvien);
        Intent intent = getIntent();
        listSinhVien = (ListSinhVien) intent.getSerializableExtra("SinhVienList");
        sinhVienAdapter = new SinhVienAdapter(listSinhVien, SinhVienActivity.this);
        sinhVienLVAX = findViewById(R.id.sinhVienList);
        sinhVienLVAX.setAdapter(sinhVienAdapter);
    }

}
