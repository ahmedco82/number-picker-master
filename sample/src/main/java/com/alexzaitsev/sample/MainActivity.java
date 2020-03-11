package com.alexzaitsev.sample;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alexzaitsev.meternumberpicker.MeterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MeterView meterNumberPicker;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //meterNumberPicker = (MeterView) findViewById(R.id.meterView2);
        //  meterNumberPicker.setValue(6000);
        //Button button = (Button) findViewById(R.id.button);

    }
}
