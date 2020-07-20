package com.zaman.project01.cs360;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class Activity6 extends AppCompatActivity {

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity6);

        ArrayList<ExampleItem> examplelist = new ArrayList<>();
        examplelist.add(new ExampleItem("text01", "text02"));
        examplelist.add(new ExampleItem("text03", "text04"));

    }
}
