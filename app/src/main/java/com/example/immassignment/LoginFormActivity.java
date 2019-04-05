package com.example.immassignment;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginFormActivity extends AppCompatActivity {

    EditText username, pin;
    TextView fdBack;
    String userName, password, feedBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        username = findViewById(R.id.edtUserName);
        pin = findViewById(R.id.edtPassword);
        fdBack = findViewById(R.id.loginFeedBack);
    }

    public void loginClicked(View v){
        userName = username.getText().toString();
        password = pin.getText().toString();

        if (userName.contentEquals("admin") && password.contentEquals("1234")){
            fdBack.setText("Login = Success");
            fdBack.setTextColor(Color.BLUE);
        }else{
            fdBack.setText("Invalid");
            fdBack.setTextColor(Color.RED);
        }

    }

    public void registerClicked(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
