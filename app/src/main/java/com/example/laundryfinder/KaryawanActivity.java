package com.example.laundryfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class KaryawanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karyawan);
    }

    public void logout(View view) {
        Toast.makeText(KaryawanActivity.this, "Keluar", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(KaryawanActivity.this, MainActivity.class));
        finish();
    }
}