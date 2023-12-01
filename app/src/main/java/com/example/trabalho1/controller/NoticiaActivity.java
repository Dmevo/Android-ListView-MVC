package com.example.trabalho1.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trabalho1.R;

public class NoticiaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.trabalho1.R.layout.noticia);

        String titulo = getIntent().getStringExtra("titulo");
        String conteudo = getIntent().getStringExtra("conteudo");

        TextView tituloTextView = findViewById(R.id.titulo1);
        TextView conteudoTextView = findViewById(R.id.texto1);

        tituloTextView.setText(titulo);
        conteudoTextView.setText(conteudo);
    }

    public void VoltarHome(View view) {

        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
