package com.example.duomath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnJourney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJourney = findViewById(R.id.btnSelectJourney);
        btnJourney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaJornada = new Intent(getApplicationContext(),JornadaActivity.class);
                startActivity(telaJornada);
            }
        });

    }
}