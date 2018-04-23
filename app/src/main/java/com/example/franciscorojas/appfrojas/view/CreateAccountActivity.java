package com.example.franciscorojas.appfrojas.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.franciscorojas.appfrojas.R;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

    showToolbar(getResources().getString(R.string.toolbar_tittle_createaccount),true);
    }
    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    public void goPosRegister(View view){
        Intent intent = new Intent(this, PostRegisterActivity.class);
        startActivity(intent);
    }

}
