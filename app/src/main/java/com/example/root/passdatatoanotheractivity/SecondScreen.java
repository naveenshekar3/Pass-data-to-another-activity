package com.example.root.passdatatoanotheractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    private TextView textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        textView1=(TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);

        Intent intent=getIntent();
        textView1.setText("Name : "+intent.getStringExtra("name"));
        textView2.setText("Phone : "+intent.getStringExtra("phone"));
        textView3.setText("Address : "+intent.getStringExtra("address"));

    }
}
