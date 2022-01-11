package com.example.laundryfinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AdminActivity extends AppCompatActivity {

    CardView cardData;
    CardView cardMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        cardData = findViewById(R.id.cardData);
        cardMaps = findViewById(R.id.cardMaps);

        cardData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminActivity.this, DataActivity.class);
                startActivity(intent);
//                showToast("Admin Clicked");
            }
        });
        cardMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminActivity.this, MapsActivity.class);
                startActivity(intent);
//                showToast("Karyawan Clicked");
            }
        });
    }
    public void logout(View view) {
        Toast.makeText(AdminActivity.this, "Loggout Succesfully", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(AdminActivity.this, LoginAdmin.class));
        finish();
    }
}