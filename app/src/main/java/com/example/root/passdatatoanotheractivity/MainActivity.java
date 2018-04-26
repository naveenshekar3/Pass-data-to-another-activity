package com.example.root.passdatatoanotheractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText address_Etv, name_Etv,phone_Etv;
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name_Etv=(EditText)findViewById(R.id.name_Etv);
        phone_Etv=(EditText)findViewById(R.id.phone_Etv);
        address_Etv=(EditText)findViewById(R.id.address_Etv);
    }

    public void send(View view) {
        Intent intent=new Intent(MainActivity.this,SecondScreen.class);
        String name=name_Etv.getText().toString();
        intent.putExtra("name",name);
        String phone=phone_Etv.getText().toString();
        intent.putExtra("phone",phone);
        String address=address_Etv.getText().toString();
        intent.putExtra("address",address);
        startActivity(intent);
    }
}
