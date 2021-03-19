package com.example.two_activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_count;
    private TextView counter;
    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_count=findViewById(R.id.button);
        counter=findViewById(R.id.Count_view);
        btn_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count+1;
                counter.setText(""+count);
            }
        });

        if(savedInstanceState !=null){

            int cnt=savedInstanceState.getInt("counting");
            count=cnt;
            counter.setText(""+count);
        }
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counting",count);
    }
}