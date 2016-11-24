package com.vhiefa.idealbodycounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by vhiefa on 2016-11-23.
 */

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void menuHitung(View view){
        Intent intent = new Intent(MenuActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void menuTentang (View view){
        Intent intent = new Intent(MenuActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}
