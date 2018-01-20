package com.diegoramirez.proyecto3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        texto=(TextView)findViewById(R.id.tv_ñ);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();


            String cadena= (String)bundle.get("name");
            texto.setText(cadena);

        }

    }

