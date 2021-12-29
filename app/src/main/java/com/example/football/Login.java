package com.example.football;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
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

public class Login extends AppCompatActivity {

    EditText edtEmail, edtPassWord;
    Button btnLogin;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        progressDialog = new ProgressDialog(this);

        edtEmail = findViewById(R.id.edtEmail);
        edtPassWord = findViewById(R.id.edtPassWord);
        btnLogin = findViewById(R.id.btnLogin);

        //Switch to sign up screen
        findViewById(R.id.lnSignUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, SignUp.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickLogin();
            }
        });
    }

    //Login
    private void onClickLogin() {
        String strEmail = edtEmail.getText().toString().trim();
        String strPassWord = edtPassWord.getText().toString().trim();
        FirebaseAuth auth = FirebaseAuth.getInstance();

        if(TextUtils.isEmpty(strEmail)){
            edtEmail.setError("Please enter email.");
            return;
        }
        if(TextUtils.isEmpty(strPassWord)){
            edtPassWord.setError("Please enter password.");
            return;
        }

        progressDialog.show();

        auth.signInWithEmailAndPassword(strEmail, strPassWord).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressDialog.dismiss();

                if (task.isSuccessful()) {
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                    finishAffinity();
                } else {
                    Toast.makeText(Login.this, "Your username or password is incorrect. Please try again.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}