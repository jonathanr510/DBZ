package com.jonny.android.dbz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Go extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);
    }
    public void openGohan(View view){
    Intent i = new Intent(this, Goku_java.class);
    startActivity(i);
}

    public void openTrunks(View view) {
        Intent i = new Intent(this, Trunks_java.class);
        startActivity(i);
    }
    public void openVegeta(View view) {
        Intent i = new Intent(this, Vegeta_java.class);
        startActivity(i);
    }
    public void openGoku(View view) {
        Intent i = new Intent(this, Goku_java .class);
        startActivity(i);
    }
}
