package com.zpj.myapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Log.d("MainActivity", this.toString());
        Log.d("aaaaaaaaa", "Task id is " + getTaskId());
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                //startActivityForResult(intent, 1);//这里的1 是请求码 必须是唯一值
                startActivity(intent);

            }
        });

        Button button2 = (Button) findViewById(R.id.button_exit);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
            }
        });
    }



//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d("MainActivity", "onRestart");
//    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "onRestart");
    }
}
