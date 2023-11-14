package com.example.duomath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class Tarefa1Activity extends AppCompatActivity {

    Button r1, r2, r3, r4, btnVoltar;
    TextView txtTermo1, txtTermo2, txtOp, txtResp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa1);

        r1 = findViewById(R.id.resp1);
        r2 = findViewById(R.id.resp2);
        r3 = findViewById(R.id.resp3);
        r4 = findViewById(R.id.resp4);

        txtTermo1 = findViewById(R.id.txtTermo1);
        txtTermo2 = findViewById(R.id.txtTermo2);
        txtOp = findViewById(R.id.txtOp);
        txtResp = findViewById(R.id.txtResp);

        Integer questionType = new Random().nextInt(1);

        switch(questionType){
            case 0:
                Integer termo1 = new Random().nextInt(26);
                Integer termo2 = new Random().nextInt(26);
                Integer resposta = termo1 + termo2;

                Integer[] alternativas = {resposta - 1, resposta + 1, resposta, resposta, resposta + 2};

                r1.setText(alternativas[new Random().nextInt(4)]);



                txtTermo1.setText(Integer.toString(termo1));
                txtTermo2.setText(Integer.toString(termo2));
                txtResp.setText(" = X");
                txtOp.setText(" + ");



                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
        }

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaJornada = new Intent(getApplicationContext(),JornadaActivity.class);
                startActivity(telaJornada);
            }
        });


    }
}