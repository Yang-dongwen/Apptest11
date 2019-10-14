package com.example.dw.apptest1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Page32 extends AppCompatActivity {
    private Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page32);
        but1 = findViewById(R.id.but2);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page32.this, Page33.class);
                startActivity(intent);
            }
        });
    }

    public void tanchuang(View view) {
        TextView but = findViewById(R.id.edit1);
        CharSequence text = but.getText();
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
