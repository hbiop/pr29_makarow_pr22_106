package com.example.pr29_makarow_pr22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
ImageButton camera, web, phone, geo;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init()
    {
        camera = (ImageButton) findViewById(R.id.camera);
        camera.setOnClickListener(this);
        web = (ImageButton) findViewById(R.id.web);
        web.setOnClickListener(this);
        phone = (ImageButton) findViewById(R.id.phone);
        phone.setOnClickListener(this);
        geo = (ImageButton) findViewById(R.id.geo);
        geo.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.camera:
                startActivity(new Intent(this, Camera2.class));
                break;
            case R.id.phone:
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:12345"));
                startActivity(intent);
                break;
            case R.id.geo:
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:55.754283,37.62002"));
                startActivity(intent);
                break;
            case R.id.web:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com")));
                break;
        }
    }
}