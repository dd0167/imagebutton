package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton imb;
    ImageView imv;
    int t1;
    int t2;
    int t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imb=(ImageButton) findViewById(R.id.imb);
        imb.setImageResource(R.drawable.click);
        imv=(ImageView) findViewById((R.id.imv));
        t1=R.drawable.one;
        t2=R.drawable.two;
        t3=R.drawable.three;
    }

    public void click(View view) {

        int r= (int) (Math.random()*(3-1+1)+1);
        if(r==1)
        {
            imb.setImageResource(R.drawable.one);
            imv.setImageResource(R.drawable.re);
        }
        if(r==2)
        {
            imb.setImageResource(R.drawable.two);
            imv.setImageResource(R.drawable.rek);
        }
        if(r==3)
        {
            imb.setImageResource(R.drawable.three);
            imv.setImageResource(R.drawable.reka);
        }
    }
}
