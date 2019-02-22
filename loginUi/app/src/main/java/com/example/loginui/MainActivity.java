package com.example.loginui;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rellay; //This is  for spalsh screen
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay.setVisibility(View.VISIBLE);

        }
    };

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rellay = (RelativeLayout) findViewById(R.id.rellay);

        handler.postDelayed(runnable,2000);


        button = (Button) findViewById(R.id.buttonn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlol();
            }
        });
    }
    public void openlol(){
        Intent intent = new Intent(this,landing.class);
        startActivity(intent);
    }
}
