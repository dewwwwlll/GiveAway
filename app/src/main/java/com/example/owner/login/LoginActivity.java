package com.example.owner.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {


    private FirebaseUser currentUser;
    private Button loginButton, mobileLoginButton;
    private EditText userEmail, userPassword;
    private TextView needNewAccoutnLink, forgotPasswordLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        InitializeFields();

        needNewAccoutnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendUserToRegisterActivity();
            }
        });
    }

    private void InitializeFields() {

        loginButton = (Button) findViewById(R.id.login_button);
        mobileLoginButton = (Button) findViewById(R.id.phone_login_button);
        userEmail = (EditText) findViewById(R.id.login_email);
        userPassword = (EditText) findViewById(R.id.login_password);
        needNewAccoutnLink = (TextView) findViewById(R.id.need_new_account_link);
        forgotPasswordLink = (TextView) findViewById(R.id.forget_password_link);


    }


    protected void onStart(){
        super.onStart();

        if(currentUser != null){
            sendUserToMainActivity();
        }
    }

    private void sendUserToMainActivity() {

        Intent main = new Intent(LoginActivity.this, nav.class);
        startActivity(main);
    }


    private void sendUserToRegisterActivity() {

        Intent register = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(register);
    }
}
