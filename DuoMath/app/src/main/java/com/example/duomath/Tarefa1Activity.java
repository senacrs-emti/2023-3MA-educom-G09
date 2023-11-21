package com.example.duomath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class Tarefa1Activity extends AppCompatActivity {

    Button r1, r2, r3, r4, btnVoltar, btnNext;
    TextView txtTermo1, txtTermo2, txtOp, txtResp;
    boolean respondido = false;

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

        int questionType = new Random().nextInt(3);

        int termo1 = new Random().nextInt(26);
        int termo2 = new Random().nextInt(26);
        int resposta = 0;

        switch(questionType){
            case 0:

                resposta = termo1 + termo2;

                String termo1txt = Integer.toString(termo1);
                String termo2txt = Integer.toString(termo2);


                txtTermo1.setText(termo1txt);
                txtTermo2.setText(termo2txt);
                txtResp.setText(" = X");
                txtOp.setText(" + ");
                break;
            case 1:
                resposta = termo1 - termo2;

                termo1txt = Integer.toString(termo1);
                termo2txt = Integer.toString(termo2);


                txtTermo1.setText(termo1txt);
                txtTermo2.setText(termo2txt);
                txtResp.setText(" = X");
                txtOp.setText(" - ");
                break;
            case 2:
                termo2 = new Random().nextInt(4) + 1;
                resposta = termo1 * termo2;

                termo1txt = Integer.toString(termo1);
                termo2txt = Integer.toString(termo2);


                txtTermo1.setText(termo1txt);
                txtTermo2.setText(termo2txt);
                txtResp.setText(" = X");
                txtOp.setText(" * ");
                break;
        }

        Integer[] alternativas = {resposta - (new Random().nextInt(5)+1), resposta + (new Random().nextInt(5)+1), resposta, new Random().nextInt(100)};

        r1.setText(Integer.toString(alternativas[new Random().nextInt(4)]));
        r2.setText(Integer.toString(alternativas[new Random().nextInt(4)]));
        r3.setText(Integer.toString(alternativas[new Random().nextInt(4)]));
        r4.setText(Integer.toString(alternativas[new Random().nextInt(4)]));


        while(r2.getText() == r1.getText() || r2.getText() == r3.getText() || r2.getText() == r4.getText()){
            r2.setText(Integer.toString(alternativas[new Random().nextInt(4)]));
        }
        while(r3.getText() == r1.getText() || r2.getText() == r3.getText() || r2.getText() == r4.getText()){
            r3.setText(Integer.toString(alternativas[new Random().nextInt(4)]));
        }

        while(r4.getText() == r1.getText() || r4.getText() == r2.getText() || r4.getText() == r3.getText()){
            r4.setText(Integer.toString(alternativas[new Random().nextInt(4)]));
        }

        String finalResposta = Integer.toString(resposta);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respondido = true;
                btnNext.setBackgroundColor(Color.parseColor("#FFFF0051"));
                if(r1.getText() == finalResposta){
                    r1.setBackgroundColor(Color.parseColor("#07DB40"));
                }else{

                }
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respondido = true;
                btnNext.setBackgroundColor(Color.parseColor("#FFFF0051"));
                if(r2.getText() == finalResposta){
                    r2.setBackgroundColor(Color.parseColor("#07DB40"));

                }else{

                }
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respondido = true;
                btnNext.setBackgroundColor(Color.parseColor("#FFFF0051"));
                if(r3.getText() == finalResposta){
                    r3.setBackgroundColor(Color.parseColor("#07DB40"));

                }else{

                }
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respondido = true;
                btnNext.setBackgroundColor(Color.parseColor("#FFFF0051"));
                if(r4.getText() == finalResposta){
                    r4.setBackgroundColor(Color.parseColor("#07DB40"));
                }else{

                }
            }
        });



        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaJornada = new Intent(getApplicationContext(),JornadaActivity.class);
                startActivity(telaJornada);
            }
        });
        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(respondido){
                    Intent telaTarefa = new Intent(getApplicationContext(),Tarefa1Activity.class);
                    startActivity(telaTarefa);
                }

            }
        });



    }
}