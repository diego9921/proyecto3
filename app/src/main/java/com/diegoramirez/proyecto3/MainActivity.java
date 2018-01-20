package com.diegoramirez.proyecto3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //TextView tvtext;
    //Button btnRegister;
    ImageView ivarbusto;
    //Button btnfacebook;
    Button btningresar;
    EditText etcorreo;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tvtext=findViewById(R.id.tv_text);
        //btnfacebook=findViewById(R.id.btn_facebook);
        btningresar=findViewById(R.id.btn_ingresar);
        //btnRegister=findViewById(R.id.btn_register);
        ivarbusto=findViewById(R.id.iv_arbusto);
        etcorreo=(EditText)findViewById(R.id.et_correo);

        //btnRegister.setOnClickListener(this);
        btningresar.setOnClickListener(this);
        //btnfacebook.setOnClickListener(this);
        ivarbusto.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_arbusto:
                Toast.makeText(getApplicationContext(),"Hola esto es un Toast",Toast.LENGTH_SHORT).show();
                break;
            //case R.id.btn_register:
                //tvtext.setText("hola");
                //break;
            //case R.id.btn_facebook:
                //tvtext.setText("no hay conexión disponible");
                //break;
            //case R.id.btn_ingresar:
                //Intent intent= new Intent(this,Main2Activity.class);
               // String dato=etcorreo.getText().toString();
               // intent.putExtra("Dato", dato);
              //  startActivity(intent);
              //  break;



        }

    }
}
