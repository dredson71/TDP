package com.example.objectmovement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout objectLayout;
    private Button objectMotion;
    private float x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objectLayout = (RelativeLayout) findViewById(R.id.objectLayout);
        objectMotion = (Button) findViewById(R.id.objectMotion);
        objectMotion.setClickable(false);

        objectLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                x = event.getX();
                y = event.getY();
                if(event.getAction() == MotionEvent.ACTION_MOVE)
                {
                    objectMotion.setX(x-200);
                    objectMotion.setY(y-200);
                }

                return true;
            }
        });
    }
}
