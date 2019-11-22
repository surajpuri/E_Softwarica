package com.example.e_softwaricaapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    EditText name, password;
    Button login;
    private  int counter = 5;
    TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = findViewById(R.id.ET_UserName);
        password = findViewById(R.id.ET_Password);
        login = findViewById(R.id.btn_Login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(),password.getText().toString());
            }
        });
    }
    public  void  validate(String name, String password){
        if ((name.equals("") || password.equals(""))) {

            return;
        }
        if (name.equals("suraj") && password.equals("suraj")){
            Intent intent = new Intent(Login_Activity.this, MainActivity.class);
            startActivity(intent);
        } else {
            counter --;
            error.setText("No fo attempts remaining: "+String.valueOf(counter));

            if (counter ==0){
                login.setEnabled(false);
            }
        }
    }
}
