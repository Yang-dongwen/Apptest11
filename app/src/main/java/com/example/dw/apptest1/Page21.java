package com.example.dw.apptest1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Page21 extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page21);
        button = findViewById(R.id.niming);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Page21.this, Page22.class);
                startActivity(intent);
            }
        });

    }

    public void clickTest(View view) {
        Toast.makeText(this, "指定的Button的onClick属性", Toast.LENGTH_SHORT).show();
    }


}
