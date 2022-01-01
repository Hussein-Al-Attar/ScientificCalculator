package com.example.cb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RseultActivity extends AppCompatActivity {
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rseult);
        textResult= (TextView) findViewById(R.id.textResult);
        Intent intent=getIntent();
        String Result=intent.getStringExtra("result").toString();
        textResult.setText(Result);
    }
}