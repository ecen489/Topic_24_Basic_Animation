package com.example.t24_animations;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.audiofx.AcousticEchoCanceler;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class BallView extends View {

    public BallView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private int SIZE = 200;
    private int ballX = 0;
    private int dx = 15;


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint yellow = new Paint(); // face
        yellow.setARGB(255, 255, 255, 0);
        yellow.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(ballX, 100, ballX + 200, 300), yellow);
    }

    void move(){

        ballX += dx;
        postInvalidate();
    }
}

