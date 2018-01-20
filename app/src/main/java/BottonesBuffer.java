import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.diegoramirez.proyecto3.Main2Activity;
import com.diegoramirez.proyecto3.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by DIANA on 20/01/2018.
 */

public class BottonesBuffer extends AppCompatActivity {
    @BindView(R.id.iv_arbusto)
    ImageView ivArbusto;
    @BindView(R.id.et_correo)
    EditText etCorreo;
    @BindView(R.id.et_pass)
    EditText etPass;
    @BindView(R.id.btn_ingresar)
    Button btnIngresar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_ingresar)
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R. id.btn_ingresar:
                Intent intent = new Intent(this,Main2Activity.class);
                String diego=etCorreo.getText().toString();
                intent.putExtra("nombre","diego");

                startActivity(intent);


        }
    }
}