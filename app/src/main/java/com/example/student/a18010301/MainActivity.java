package com.example.student.a18010301;
// 網路抓圖
// 1.add gradle picasso 原始碼
// 2.add 網路權限
// 3.Button
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;觸發 picasso
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imageView);


    }
    public void click1(View view){
        img.setImageResource(R.drawable.car);
    }
    public void  click2(View V){
        Picasso.with(MainActivity.this).load("http://www.pcschool.com.tw/updimg/act/2017RWD_AD/7bAD_945d.jpg").into(img);


    }

}
