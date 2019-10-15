package com.example.dw.apptest1;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Page51 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page51);

        Log.w("Activity生命周期","onCrrate执行");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("Activity生命周期","onStart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("Activity生命周期","onPause");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.w("Activity生命周期","onPostResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("Activity生命周期","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("Activity生命周期","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("Activity生命周期","onRestart");
    }

    public void click1(View v){
        Intent intent = new Intent(this,Page52.class);
        startActivity(intent);
    }

    public void click3(View v){
        AlertDialog alert = new AlertDialog.Builder(Page51.this).create();
        alert.setIcon(R.mipmap.ic_launcher);
        alert.setTitle("系统提醒：");
        alert.setMessage("带取消、中立、确定按钮的对话框。");

        alert.setButton(DialogInterface.BUTTON_NEGATIVE ,"取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Page51.this,"您点击了取消按钮",Toast.LENGTH_SHORT).show();
            }
        });

        alert.setButton(DialogInterface.BUTTON_POSITIVE ,"确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Page51.this,"您点击了确定按钮",Toast.LENGTH_SHORT).show();
            }
        });

        alert.setButton(DialogInterface.BUTTON_NEUTRAL ,"中立", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Page51.this,"您点击了中立按钮",Toast.LENGTH_SHORT).show();
            }
        });

        alert.show();
    }
}
