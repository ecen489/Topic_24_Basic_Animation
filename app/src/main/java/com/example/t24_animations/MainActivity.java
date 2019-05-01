package com.example.t24_animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    BallView myBall;
    Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button) findViewById(R.id.button);
        myBall = (BallView) findViewById(R.id.ball);
    }



    public void myClick(View view) {
        myBall.move();
    }
}
