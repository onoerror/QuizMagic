package com.quizmagic.quizmagic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class QuizMagic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_magic);

    }

    public void mu(View view) {
        //mu是一個變數
        TextView mu = (TextView)findViewById(R.id.textany);
        //文字檔案 變數 = (轉文字檔)搜尋需轉換的物件（物件身分證）
        mu.setText("你沒有這個命!");
        //變數.文字類別(文字字串)
    }


    public void st(View view) {
        TextView mu = (TextView)findViewById(R.id.textany);
        mu.setText("如果愚笨也算是一種屬性的話...");
    }

    public void nz(View view) {
        TextView mu = (TextView)findViewById(R.id.textany);
        mu.setText("麻煩去旁邊吃土好嗎，謝謝");
    }

    public void ju(View view) {
        TextView mu = (TextView)findViewById(R.id.textany);
        mu.setText("聽說世界上有一種生物叫做孬種");
    }

    public void jz(View view) {
        TextView mu = (TextView)findViewById(R.id.textany);
        mu.setText("這是我這輩子聽過最好笑的笑話了，哈哈哈");
    }

    public void out(View view) {
        TextView mu = (TextView)findViewById(R.id.textany);
        mu.setText("很抱歉，沒有離開這個選項  /(030)/");
    }
}
