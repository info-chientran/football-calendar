package com.example.football;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

public class SignUp extends AppCompatActivity {

    EditText edtEmailSU, edtPassWordSU, edtConfirmPass;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Switch to login screen
        findViewById(R.id.lnSignIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });

        //Sign up
        edtEmailSU = findViewById(R.id.edtEmailSU);
        edtPassWordSU = findViewById(R.id.edtPassWordSU);
        edtConfirmPass = findViewById(R.id.edtConfirmPass);
        btnSignUp = findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickSignUp();
            }
        });
    }

    private void onClickSignUp() {
        String strEmail = edtEmailSU.getText().toString().trim();
        String strPassWord = edtPassWordSU.getText().toString().trim();
        String strConfirmPass = edtConfirmPass.getText().toString();
        FirebaseAuth auth = FirebaseAuth.getInstance();

        if(TextUtils.isEmpty(strEmail)){
            edtEmailSU.setError("Please enter email.");
            return;
        }
        if(TextUtils.isEmpty(strPassWord)){
            edtPassWordSU.setError("Please enter password.");
            return;
        }
        if(strPassWord.length() < 6){
            edtPassWordSU.setError("Password is only 6 characters long.");
            return;
        }
        if(!strPassWord.equals(strConfirmPass)){
            edtConfirmPass.setError("Passwords do not match, please retype.");
            return;
        }
        auth.createUserWithEmailAndPassword(strEmail, strPassWord).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(SignUp.this,"Account successfully created.", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(SignUp.this, MainActivity.class);
                    startActivity(intent);
                } else{
                    Toast.makeText(SignUp.this,"Please try again.", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}