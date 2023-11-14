package com.example.duomath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JornadaActivity extends AppCompatActivity {

    Button btnBasico, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jornada);

        btnBasico = findViewById(R.id.btnBasico);
        btnBasico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaTarefa = new Intent(getApplicationContext(), Tarefa1Activity.class);
                startActivity(telaTarefa);
            }
        });
        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(telaMain);
            }
        });
    }
}