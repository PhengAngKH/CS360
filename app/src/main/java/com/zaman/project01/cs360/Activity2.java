package com.zaman.project01.cs360;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


public class Activity2 extends AppCompatActivity {

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity2);
    }
    public void browser1 (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://docs.google.com/spreadsheets/d/1hRUIPygz6Yskq_meTgUccucl8-vJlsXImlYYYVPQ7xk/edit#gid=1092709930"));
        startActivity(browserIntent);
    }


}








