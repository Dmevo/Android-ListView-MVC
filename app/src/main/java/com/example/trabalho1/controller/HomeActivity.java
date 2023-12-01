package com.example.trabalho1.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trabalho1.NoticiaAdapter;
import com.example.trabalho1.R;
import com.example.trabalho1.entity.Noticia;
import com.example.trabalho1.model.NoticiaModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        View view;
        NoticiaModel noticiaModel = new NoticiaModel();
        List<Noticia> noticias = noticiaModel.getNoticias();
        NoticiaAdapter adapter = new NoticiaAdapter(this, noticias);
        ListView listView = findViewById(R.id.ListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Noticia selectedNoticia = noticias.get(position);
                Intent intent = new Intent(HomeActivity.this, NoticiaActivity.class);

                intent.putExtra("titulo", selectedNoticia.getTitulo());
                intent.putExtra("conteudo", selectedNoticia.getTexto());

                startActivity(intent);
            }
        });
    }
}

