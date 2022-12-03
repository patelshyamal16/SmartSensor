package com.example.SmartSensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

public class LogoActivity extends AppCompatActivity {

    ImageView splashImg,appShare;
    LottieAnimationView lottieAnimationView;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo_activity);

        splashImg = findViewById(R.id.logoimg);
        appShare = findViewById(R.id.logoshape);
        lottieAnimationView = findViewById(R.id.lottieAnimationView);


        splashImg.animate().translationY(-3000).setDuration(1000).setStartDelay(4000);
        appShare.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(LogoActivity.this, login.class);
                startActivity(intent);
                finish();
            }
        }, 4900);

    }
}