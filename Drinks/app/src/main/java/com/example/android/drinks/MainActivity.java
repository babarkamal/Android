package com.example.android.drinks;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import layout.Menu_Drinks;


public class MainActivity extends AppCompatActivity {

    private EditText text1;
    private EditText text2;
    private FirebaseAuth mAuth;
    private Button text3;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mAuth= FirebaseAuth.getInstance();

        text1 = (EditText) findViewById(R.id.email);
        text2 = (EditText) findViewById(R.id.pass);
        text3 = (Button) findViewById(R.id.btn);


        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if(firebaseAuth.getCurrentUser()!=null){
                    startActivity(new Intent(MainActivity.this,activity_main1.class));
                }
            }
        };



        text3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Startsignin();

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    public void Startsignin()
    {
        String email=text1.getText().toString();
        String password=text2.getText().toString();

        if (TextUtils.isEmpty(email) || (TextUtils.isEmpty(email) )) {

            Toast.makeText(MainActivity.this,"Fields are empty",Toast.LENGTH_LONG).show();

        }
        else {


            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(!task.isSuccessful()){
                        Toast.makeText(MainActivity.this,"Signin Problem",Toast.LENGTH_LONG).show();
                    }

                }
            });
        }}}