package com.zaman.project01.cs360;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

//import android.support.annotation.NonNull;
//import android.support.v7.app.AppCompatActivity;
//import androidx.annotation.Nullable;


public class Register extends AppCompatActivity {
    private EditText userName, userEmail, userPassword;
    private Button regButton;
    private TextView userLogin;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        setupUIViews();

        firebaseAuth = FirebaseAuth.getInstance();

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()){
                    //upload data to the data base
                    String user_ID = userEmail.getText().toString().trim();
                    String user_Password = userPassword.getText().toString().trim();

                    firebaseAuth.createUserWithEmailAndPassword(user_ID, user_Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Register.this, MainActivity.class));

                            }else {
                                Toast.makeText(Register.this, "Registration Failed", Toast.LENGTH_SHORT).show();

                            }




                        }
                    });
                }

            }
        });

        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register.this, MainActivity.class));

            }
        });
    }

    private void setupUIViews() {
        userName = (EditText) findViewById(R.id.reguser);
        userPassword = (EditText) findViewById(R.id.regpass);
        userEmail = (EditText) findViewById(R.id.regemail);
        regButton = (Button) findViewById(R.id.buttonreg);
        userLogin = (TextView) findViewById(R.id.registerlog);

    }

    private Boolean validate(){
        Boolean result = false;

        String name = userName.getText().toString();
        String password = userPassword.getText().toString();
        String ID = userEmail.getText().toString();

        if(name.isEmpty() || password.isEmpty() || ID.isEmpty() ){
            Toast.makeText(this, "Please enter all the details", Toast.LENGTH_SHORT);

        } else {
            result = true;
        }
        return  result;
    }
}


















//        firebaseAuth = FirebaseAuth.getInstance();
//
//
//        regButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (validate()) {
//                    //upload data to the database
//                    String user_ID = userID.getText().toString().trim();
//                    String user_password = userPassword.getText().toString().trim();
//
//                    firebaseAuth.createUserWithEmailAndPassword(user_ID, user_password).addOnCompleteListener(new onCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            if (task.isSucessful()) {
//                                Toast.makeText(Register.this, "Registration Successful", LENGTH_SHORT).show();
//                                startActivity(new Intent(Register.this, MainActivity.class));
//
//                            } else {
//                                Toast.makeText(Register.this, "Registration Failed", LENGTH_SHORT).show();
//                            }
//                        });
//                    }
//                }
//            }
//
//
//        userLogin.setOnClickListener(new View.OnClickListener()
//
//            {
//                @Override
//                public void onClick (View view){
//                startActivity(new Intent(Register.this, MainActivity.class));
//
//            }
//            });
//
//        }
//
//
//   {
//            userName = (EditText) findViewById(R.id.reguser);
//            userID = (EditText) findViewById(R.id.regid);
//            userPassword = (EditText) findViewById(R.id.regpass);
//            regButton = (Button) findViewById(R.id.buttonreg);
//            userLogin = (TextView) findViewById(R.id.registerlog);
//        }
//        private Boolean validate () {
//            Boolean result = false;
//
//            String name = userName.getText().toString();
//            String password = userPassword.getText().toString();
//            String id = userID.getText().toString();
//
//            if (name.isEmpty() || password.isEmpty() || id.isEmpty()) {
//                Toast.makeText(this, "Pleases enter all the details", LENGTH_SHORT);
//            } else {
//                result = true;
//            }
//            return result;
//        }
//    }
//
//
//
//
//
