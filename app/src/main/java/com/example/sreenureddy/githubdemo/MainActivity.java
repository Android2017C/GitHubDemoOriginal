package com.example.sreenureddy.githubdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button textView,second_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(Button)findViewById(R.id.Android);
        textView.setText("Cnu Reddy C");
        second_text=(Button)findViewById(R.id.second_tv);
        second_text.setText("***** Welcome To Android *****");

    }
}
