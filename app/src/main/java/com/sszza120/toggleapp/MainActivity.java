package com.sszza120.toggleapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    ToggleButton toggleButton;
    ImageView img_bulb_off, img_bulb_on;
    ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_bulb_off = findViewById(R.id.img_bulb_off);
        img_bulb_on = findViewById(R.id.img_bulb_on);
        layout = findViewById(R.id.layout);
        toggleButton = findViewById(R.id.toggleButton);
        //設定ID元件

        layout.setBackgroundColor(Color.parseColor("#FFFF37"));
        //預設背景顏色為黃色
        toggleButton.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean b) {
        if (b) {
            layout.setBackgroundColor(Color.parseColor("#000000"));
            img_bulb_off.setVisibility(View.VISIBLE);
            //顯示img_bulb_off元件圖片
            img_bulb_on.setVisibility(View.INVISIBLE);
            //隱藏img_bulb_on元件圖片

        }else {

            layout.setBackgroundColor(Color.parseColor("#FFFF37"));
            img_bulb_off.setVisibility(View.INVISIBLE);
            //隱藏img_bulb_off元件圖片
            img_bulb_on.setVisibility(View.VISIBLE);
            //顯示img_bulb_on元件圖片
        }
    }
}
