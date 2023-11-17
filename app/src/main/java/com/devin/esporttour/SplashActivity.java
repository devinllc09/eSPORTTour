package com.devin.esporttour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    TextView loginscrbtn, signscrbtn;
    LinearLayout splash, login, otplyt,signup;
    Button loginbtn, signupbtn, subotpbtn;
    private static int Spl_time = 1700;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        layouts
        splash = findViewById(R.id.splashlyt);
        login = findViewById(R.id.loginlyt);
        otplyt = findViewById(R.id.otplyt);
        signup = findViewById(R.id.signup);
//        btns
        loginbtn = findViewById(R.id.login);
        signupbtn = findViewById(R.id.signupbtn);
//        text
        loginscrbtn = findViewById(R.id.loginscrtext);
        signscrbtn = findViewById(R.id.signscrbtn);
//        btns
//        SPLASH
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                splash.setVisibility(View.GONE);
                login.setVisibility(View.GONE);
                otplyt.setVisibility(View.GONE);
                signup.setVisibility(View.VISIBLE);
//                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
//                startActivity(intent);
//                finish();
            }
        },Spl_time);
//SPLASH
        loginscrbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                splash.setVisibility(View.GONE);
                otplyt.setVisibility(View.GONE);
                login.setVisibility(View.VISIBLE);
                signup.setVisibility(View.GONE);

            }
        });
        signscrbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                splash.setVisibility(View.GONE);
                login.setVisibility(View.GONE);
                otplyt.setVisibility(View.GONE);
                signup.setVisibility(View.VISIBLE);

            }
        });
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                splash.setVisibility(View.GONE);
                login.setVisibility(View.GONE);
                otplyt.setVisibility(View.VISIBLE);
                signup.setVisibility(View.GONE);

            }
        });

    }
}