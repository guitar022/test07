package com.practicalcoding.test07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtEmail;
    private EditText txtPassword;
    private Button buttonLogin;
    private Button buttonRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtEmail = findViewById(R.id.txtEmailCreate);
        txtPassword = findViewById(R.id.txtPasswordCreate);
        buttonLogin = findViewById(R.id.buttonlogin);
        buttonRegister = findViewById(R.id.buttonSubmit);

        //เปลี่ยนหน้าไปสมัครสมาชิก
        Button buttonRegister = (Button) findViewById(R.id.buttonSubmit);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this ,RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}