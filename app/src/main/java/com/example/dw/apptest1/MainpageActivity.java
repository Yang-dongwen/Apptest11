package com.example.dw.apptest1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainpageActivity extends AppCompatActivity {
    private ListView listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
        listView1 = findViewById(R.id.listView1);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: break;
                    case 1:
                        Intent intent0 = new Intent(MainpageActivity.this, Page21.class);
                        startActivity(intent0);
                        break;
                    case 2:
                        Intent intent = new Intent(MainpageActivity.this, Page31.class);
                        startActivity(intent);
                        break;
                    case 3:
                        Intent intent1 = new Intent(MainpageActivity.this, Page41.class);
                        startActivity(intent1);
                        break;
                    case 4:
                        Intent intent2 = new Intent(MainpageActivity.this, Page51.class);
                        startActivity(intent2);
                        break;
                }
            }
        });
    }
}
