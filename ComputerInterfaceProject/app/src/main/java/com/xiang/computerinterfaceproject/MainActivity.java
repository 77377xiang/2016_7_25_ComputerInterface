package com.xiang.computerinterfaceproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {
    GridLayout gridLayout;
    //定义16按键文本
    String []chars=new String[] {
           "7","8","9","/",
            "4","5","6","x",
            "1","2","3","-",
            ".","0","=","+",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridLayout= (GridLayout) findViewById(R.id.root);
        for (int i = 0; i < chars.length; i++) {
            Button bn=new Button(this);
            bn.setText(chars[i]);
            //设置按键字体大小  按键周围白色区域
            bn.setTextSize(40);
            bn.setPadding(5,35,5,35);
            //指定该组件所在在的行 列
            GridLayout.Spec rowSpec=GridLayout.spec(i/4+2);
            GridLayout.Spec columnSpec=GridLayout.spec(i%4);
            GridLayout.LayoutParams params=new GridLayout.LayoutParams(rowSpec,columnSpec);
            params.setGravity(Gravity.FILL);
            gridLayout.addView(bn,params);
        }
    }
}
