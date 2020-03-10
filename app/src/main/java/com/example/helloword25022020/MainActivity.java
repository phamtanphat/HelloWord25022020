package com.example.helloword25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 1 : Khai bao bien
    Button mBtnShowAlert ;
    TextView mTvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 : anh xa
        mBtnShowAlert = findViewById(R.id.buttonShow);
        mTvTitle = findViewById(R.id.textviewTitle);

        // 3 : chay code
        //In ra tren may ao thong bao
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }
}
