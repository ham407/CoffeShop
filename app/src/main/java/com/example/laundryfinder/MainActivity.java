package com.example.laundryfinder;

import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cardAdmin;
    CardView cardKaryawan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardAdmin = findViewById(R.id.cardAdmin);
        cardKaryawan = findViewById(R.id.cardKaryawan);

        cardAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginAdmin.class);
                startActivity(intent);
//                showToast("Admin Clicked");
            }
        });
        cardKaryawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginKaryawan.class);
                startActivity(intent);
//                showToast("Karyawan Clicked");
            }
        });
    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

//    INI Contoh
//    public void admin(View view) {
//        Intent intent = new Intent(MainActivity.this, LoginAdmin.class);
//        startActivity(intent);
//    }
//
//    public void karyawan(View view) {
//        Intent intent = new Intent(MainActivity.this, LoginKaryawan.class);
//        startActivity(intent);
//    }
}