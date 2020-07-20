package com.zaman.project01.cs360;

import android.app.ProgressDialog;
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
import com.google.firebase.auth.FirebaseUser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private TextView Register;
    private Button Login;
    private int counter = 5;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.editText);
        Password = (EditText) findViewById(R.id.editText2);
        Register = (TextView) findViewById(R.id.register);
        Login = (Button) findViewById(R.id.button);
        Info = (TextView) findViewById(R.id.info);


        Info.setText("No of attempts remaining: 5");

        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);

        FirebaseUser user = firebaseAuth.getCurrentUser();

        if (user != null) {
            finish();
            ;
            //startActivity(new Intent(MainActivity.this, activity1.class));
            startActivity(new Intent(MainActivity.this, activity1.class));
        }


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
                //check up
                //startActivity(new Intent(MainActivity.this, activity1.class));

            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        });

    }

    private void validate(String userName, String userPassword) {

        progressDialog.setMessage("Please wait");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(userName, userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    progressDialog.dismiss();
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, activity1.class));
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    counter--;
                    Info.setText("No of attempts remaining: " + counter);
                    progressDialog.dismiss();
                    if (counter == 0) {
                        Login.setEnabled(false);
                    }
                }
            }
        });


    }
}