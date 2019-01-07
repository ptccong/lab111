package com.example.cong.lab111;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String hoTen ="Phạm Thái Công";
        Log.d("Cong",hoTen);
        int so =5;
        if(so==5){
            Log.d("if","Đúng");
        }else{
            Log.d("if","Sai");
        }
    }
}
