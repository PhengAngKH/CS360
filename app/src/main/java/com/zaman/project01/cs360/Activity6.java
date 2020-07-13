package com.zaman.project01.cs360;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

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
