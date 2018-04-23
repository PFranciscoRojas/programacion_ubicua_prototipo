package com.example.franciscorojas.appfrojas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.franciscorojas.appfrojas.view.CreateAccountActivity;
import com.example.franciscorojas.appfrojas.view.HelpActivity;
import com.example.franciscorojas.appfrojas.view.HomeActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void goHome(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void goHelp(View view){
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }


}
