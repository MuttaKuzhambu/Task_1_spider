package com.example.android.task_1_spider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int value=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void inc(View view){
        value++;
        display(value);
    }
      public void display(int value){
        TextView display =(TextView)findViewById(R.id.value);
        display.setText(String.valueOf(value));
    }
}
