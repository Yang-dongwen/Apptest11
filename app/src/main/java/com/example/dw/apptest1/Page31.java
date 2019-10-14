package com.example.dw.apptest1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Page31 extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page31);
        textView = findViewById(R.id.text2);
        textView.setText("后台修改后的代码  哈哈!");
    }

    public void tiaoZhuan(View view) {
        Intent intent = new Intent(this, Page32.class);
        startActivity(intent);
    }
}
