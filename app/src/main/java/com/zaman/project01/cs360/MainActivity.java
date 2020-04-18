package com.zaman.project01.cs360;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick1(View view01){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);

    }

    public void onButtonClick2 (View view02){
        Intent intent1 = new Intent(this, Activity3.class);
        startActivity(intent1);
    }

}
