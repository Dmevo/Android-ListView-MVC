package com.example.trabalho1.model;

import com.example.trabalho1.entity.Noticia;

import java.util.ArrayList;
import java.util.List;

public class NoticiaModel {
    private List<Noticia> noticias;

    public NoticiaModel(){
        this.noticias = new ArrayList<>();
        noticias.add(new Noticia(1, "Lorem Ipsum", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."));
        noticias.add(new Noticia(2, "Lorem Ipsum", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."));
        noticias.add(new Noticia(3, "Lorem Ipsum", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."));
    }

    public List<Noticia> getNoticias() {
        return noticias;
    }
}
