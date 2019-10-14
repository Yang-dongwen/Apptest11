package com.example.dw.apptest1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Page33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page33);
    }

    public void mainPage(View view) {
        Intent intent = new Intent(this,MainpageActivity.class);
        startActivity(intent);

    }
}
