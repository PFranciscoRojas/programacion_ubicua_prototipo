package com.example.franciscorojas.appfrojas.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.franciscorojas.appfrojas.R;

public class PostRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_register);
    }
    public void goHelp(View view){
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }
}
