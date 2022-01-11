package com.example.laundryfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapsActivity extends AppCompatActivity {

    WebView mapsviewku;
    WebSettings websettingku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        mapsviewku = (WebView) findViewById(R.id.MapsView);
        websettingku = mapsviewku.getSettings();

        mapsviewku.setWebViewClient(new WebViewClient());
        mapsviewku.loadUrl("https://www.google.com/maps/place/Sindikat+Coffee,+Jl.+Veteran+No.84,+Warungboto,+Kec.+Umbulharjo,+Kota+Yogyakarta,+Daerah+Istimewa+Yogyakarta+55164/@-7.8119618,110.3962846,17z/data=!4m5!1m2!2m1!1scoffe+shop!3m1!1s0x2e7a579a008647ab:0xd7f5288e4f1aa2f8");
    }
}