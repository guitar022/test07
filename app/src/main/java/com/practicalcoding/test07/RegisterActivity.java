package com.practicalcoding.test07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private EditText txtEmailCreate;
    private EditText txtPasswordCreate;
    private Button buttonSubmit;

    private String email;
    private String password;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtEmailCreate = findViewById(R.id.txtEmailCreate);
        txtPasswordCreate = findViewById(R.id.txtPasswordCreate);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        mAuth = FirebaseAuth.getInstance();
        View.OnClickListener createAccont;
        buttonSubmit.setOnClickListener(createAccont());


    }

    private View.OnClickListener createAccont() {
        email = txtEmailCreate.toString();
        password = txtPasswordCreate.toString();
        mAuth.createUserWithEmailAndPassword(email,password).addOnCanceledListener((OnCanceledListener) this);

        return null;
    }

}

