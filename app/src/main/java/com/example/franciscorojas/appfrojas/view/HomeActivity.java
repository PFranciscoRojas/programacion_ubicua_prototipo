package com.example.franciscorojas.appfrojas.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.franciscorojas.appfrojas.EndActivity;
import com.example.franciscorojas.appfrojas.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        showToolbar(getResources().getString(R.string.toolbar_tittle_Home),true);

    }
    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    public void goSurface(View view){
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    public void goMac(View view){
        Intent intent = new Intent(this, DetailMacActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.acercade:
                Intent intent = new Intent(this, ProfileActivity.class );
                startActivity(intent);
                break;

            case R.id.compare:
                Intent intent2 = new Intent(this, ComparePcsActivity.class );
                startActivity(intent2);
                break;
            case R.id.seeHelp:
                Intent intent3 = new Intent(this, HelpActivity.class );
                startActivity(intent3);
                break;
            case R.id.endSession:
                Intent intent4 = new Intent(this, EndActivity.class );
                startActivity(intent4);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
