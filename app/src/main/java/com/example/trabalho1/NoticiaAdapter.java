package com.example.trabalho1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.trabalho1.entity.Noticia;

import java.util.List;

public class NoticiaAdapter extends ArrayAdapter<Noticia> {
    public NoticiaAdapter(Context context, List<Noticia> noticias) {
        super(context, 0, noticias);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.preview_noticia,
                    parent, false);
        }
        Noticia currentNoticia = getItem(position);
        TextView titulo = convertView.findViewById(R.id.titulo1);
        TextView texto = convertView.findViewById(R.id.texto1);
        titulo.setText(currentNoticia.getTitulo());
        texto.setText(currentNoticia.getTexto());
        return convertView;
    }
}
