package com.example.helloword25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;

public class MainActivity extends AppCompatActivity {

    // 1 : Khai bao bien
    Button mBtnShowAlert ;
    TextView mTvTitle;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 : anh xa
        mBtnShowAlert = findViewById(R.id.buttonShow);
        mTvTitle = findViewById(R.id.textviewTitle);

        // 3 : chay code
        //In ra tren may ao thong bao
        //built in function
//        Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
        // Kiem tra du lieu trong he thong

//        Log.d("BBB",a);
        // ctrl + P : goi y tham so truyen vao
        mBtnShowAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
