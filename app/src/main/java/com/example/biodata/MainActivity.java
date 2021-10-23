package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView txt_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void showAddress(View v) {
        Uri location = Uri.parse("geo:-7,3454536,108,8922881?q=Dekat Jl. Pasar Babakan 303, Babakan Dua, Babakan, Kec. Karangpucung, Kabupaten Cilacap, Jawa Tengah 53255");
        Intent it = new Intent(Intent.ACTION_VIEW, location);
        startActivity(it);
    }

    public void showPhone(View v) {
        String no = "081325495924";
        Intent it = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + no));
        startActivity(it);
    }

    public void sendMail(View v){
        Intent it = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "111202012694@mhs.dinus.ac.id", null));
        startActivity(Intent.createChooser(it, "Send email..."));
    }
}