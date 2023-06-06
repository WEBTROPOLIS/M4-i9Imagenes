package com.example.m4_i9imagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Empresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);
        ImageView img1 = findViewById(R.id.img1);
        TextView txtEmpresa = findViewById(R.id.txtEmpresa);
        Button btnVolver = findViewById(R.id.btnVolver);
        int imagenId = getIntent().getIntExtra("imgId",0);
        String txEmp = getIntent().getStringExtra("txtEmpresa");

        if (imagenId !=0){
            img1.setImageResource(imagenId);
        }

       if (!txEmp.isEmpty() ){
           txtEmpresa.setText(txEmp);
       }
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}