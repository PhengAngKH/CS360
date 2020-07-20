package com.zaman.project01.cs360;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.auth.FirebaseAuth;
import androidx.appcompat.app.AppCompatActivity;

//import android.support.v7.app.AppCompatActivity;


public class activity1 extends AppCompatActivity  {

    private FirebaseAuth firebaseAuth;
    private Button logout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        firebaseAuth = FirebaseAuth.getInstance();

        logout = (Button) findViewById(R.id.btnlogout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(activity1.this, MainActivity.class));

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
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }

    public void onButtonClick5(View view05){
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
    }

    public void onButtonClick6(View view06){
        Intent intent = new Intent(this, Activity7.class);
        startActivity(intent);
    }

    public void onButtonClick7(View view07){
        Intent intent = new Intent(this, Activity8.class);
        startActivity(intent);
    }

    public void onButtonClick8(View view08){
        Intent intent = new Intent(this, Activity9.class);
        startActivity(intent);
    }

    public void onButtonClick9(View view09){
        Intent intent = new Intent(this, Activity10.class);
        startActivity(intent);
    }

    public void onButtonClick10(View view10){
        Intent intent = new Intent(this, Activity11.class);
        startActivity(intent);
    }

    public void onButtonClick11(View view11){
        Intent intent = new Intent(this, Activity12.class);
        startActivity(intent);
    }

    public void onButtonClick12(View view12){
        Intent intent = new Intent(this, Activity13.class);
        startActivity(intent);
    }

    public void onButtonClick13(View view13){
        Intent intent = new Intent(this, Activity14.class);
        startActivity(intent);
    }

    public void onButtonClick14(View view14){
        Intent intent = new Intent(this, Activity15.class);
        startActivity(intent);
    }

    public void onButtonClick15(View view15){
        Intent intent = new Intent(this, Activity16.class);
        startActivity(intent);
    }






}
