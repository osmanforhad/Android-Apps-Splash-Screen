package com.example.helloapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Calling the Method
        splashScreen();
    }

    //Method for Setup SplashScreen
    private void splashScreen(){
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent mainIntent = new Intent(MainActivity.this, AppMainActivity.class);
                    startActivity(mainIntent);
                }
            }
        };
        thread.start();
    }

}
