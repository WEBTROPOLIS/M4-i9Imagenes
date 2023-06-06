package com.example.m4_i9imagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn1 = findViewById(R.id.btn1);
        ImageButton btn2 = findViewById(R.id.btn2);
        ImageButton btn3 = findViewById(R.id.btn3);
        ImageButton btn4 = findViewById(R.id.btn4);
        Button Salir = findViewById(R.id.Salir);

        Intent intent= new Intent(MainActivity.this, Empresa.class);

        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("imgId", R.drawable.logo1);
                intent.putExtra("txtEmpresa","Empresa uno");
                startActivity(intent);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("imgId", R.drawable.logo2);
                intent.putExtra("txtEmpresa","Empresa dos");
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("imgId", R.drawable.logo3);
                intent.putExtra("txtEmpresa","Empresa tres");
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("imgId", R.drawable.logo4);
                intent.putExtra("txtEmpresa","Empresa cuatro");
                startActivity(intent);
            }
        });


    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activado onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activado onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activado onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activado onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activado onDestroy");
    }

}