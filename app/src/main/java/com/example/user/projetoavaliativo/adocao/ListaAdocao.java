package com.example.user.projetoavaliativo.adocao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.example.user.projetoavaliativo.adapter.AdapterAdocao;
import com.example.user.projetoavaliativo.R;
import com.example.user.projetoavaliativo.modelo.Adocao;

import java.util.ArrayList;
import java.util.List;

public class ListaAdocao extends AppCompatActivity {

    AdapterAdocao adapterAdocao;
    private Adocao adocao;

    private List<Adocao> listaAdocao = new ArrayList<>();
    private ListView lista;


    public void preencherLista(){

        adapterAdocao = new AdapterAdocao(Adocao.listAll(Adocao.class), this);
        lista.setAdapter(adapterAdocao);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_adocao);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lista = (ListView) findViewById(R.id.listaAdocao);
        preencherLista();

    }

}
