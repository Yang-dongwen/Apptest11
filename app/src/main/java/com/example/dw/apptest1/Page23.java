package com.example.dw.apptest1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Page23 extends AppCompatActivity implements View.OnClickListener{
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page23);
        button = findViewById(R.id.jiekou);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "接口方法实现点击事件", Toast.LENGTH_SHORT).show();
    }
    public void clickTest2(View view) {
        Toast.makeText(this, "指定的Button的onClick属性", Toast.LENGTH_SHORT).show();
    }
}
