package com.zaman.project01.cs360;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

public class MainActivity extends AppCompatActivity  implements tab1.OnFragmentInteractionListener, tab2.OnFragementInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("tab 2"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }



    public void onButtonClick1(View view01){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);

    }

    public void onButtonClick2(View view02){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);

    }

    public void onButtonClick3(View view03){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }


    public void onButtonClick4(View view04){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void onButtonClick5(View view05){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void onButtonClick6(View view06){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void onButtonClick7(View view07){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void onButtonClick8(View view08){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void onButtonClick9(View view09){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void onButtonClick10(View view10){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void onButtonClick11(View view11){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void onButtonClick12(View view12){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void onButtonClick13(View view13){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void onButtonClick14(View view14){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void onButtonClick15(View view15){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }






}
