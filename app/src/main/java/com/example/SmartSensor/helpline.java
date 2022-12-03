package com.example.SmartSensor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class helpline extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);
    }

    public void cares(View v){
        Intent i1 = new Intent(Intent.ACTION_DIAL);
        i1.setData(Uri.parse("tel:8003459049"));
        startActivity(i1);
    }


    public void domestic(View view) {
        Intent i2 = new Intent(Intent.ACTION_DIAL);
        i2.setData(Uri.parse("tel:877-863-6338"));
        startActivity(i2);
    }

    public void police(View view) {
        Intent i3 = new Intent(Intent.ACTION_DIAL);
        i3.setData(Uri.parse("tel:911"));
        startActivity(i3);
    }

    public void student(View view) {
        Intent i4 = new Intent(Intent.ACTION_DIAL);
        i4.setData(Uri.parse("tel:312-996-3490"));
        startActivity(i4);
    }

    public void SexualAssault(View view) {
        Intent i5 = new Intent(Intent.ACTION_DIAL);
        i5.setData(Uri.parse("tel:800-656-4673"));
        startActivity(i5);
    }
}
