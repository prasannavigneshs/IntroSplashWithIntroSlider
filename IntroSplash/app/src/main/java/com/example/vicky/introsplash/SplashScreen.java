package com.example.vicky.introsplash;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {

    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT>=19)
        {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        else
        {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        setContentView(R.layout.activity_splash_screen);

        progressBar= (ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(progressBar.VISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this,WelcomeActivity.class));
                SplashScreen.this.finish();
            }
        },3000);
    }
}
