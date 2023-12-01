package com.example.trabalho1.entity;

public class Noticia {

    private int id;
    private String titulo;
    private String texto;

    public Noticia(int id, String titulo, String texto) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
    }

    public int getId() { return id; }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

}
