package com.zpj.myapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("ccccccccccccc", "Task id is " + getTaskId());

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                //startActivityForResult(intent, 1);//这里的1 是请求码 必须是唯一值
                startActivity(intent);

            }
        });

        Button button_da = (Button) findViewById(R.id.button_da);
        button_da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main2Activity.actionStart(Main3Activity.this, "data1", "data2");
            }
        });

    }
}
