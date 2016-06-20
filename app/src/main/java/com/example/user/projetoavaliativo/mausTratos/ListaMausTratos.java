package com.example.user.projetoavaliativo.mausTratos;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ListView;

import com.example.user.projetoavaliativo.R;
import com.example.user.projetoavaliativo.adapter.AdapterDenuncia;
import com.example.user.projetoavaliativo.modelo.MausTratos;

import java.util.ArrayList;
import java.util.List;

public class ListaMausTratos extends AppCompatActivity {


    private AdapterDenuncia adapterDenuncia;
    private MausTratos mausTratos;

    private List<MausTratos> listaMausTratos = new ArrayList<>();
    private ListView lista;

    public void chamarFormularioNovaDenuncia (View view){

        Intent it = new Intent (this,CadastrarDenuncia.class);
        startActivity(it);
    }



    public void preencherListaDenuncia(){
        adapterDenuncia = new AdapterDenuncia(MausTratos.listAll(MausTratos.class),this);
        lista.setAdapter(adapterDenuncia);
                }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_maus_tratos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lista = (ListView)findViewById(R.id.lista_maus_tratos);
        preencherListaDenuncia();

    }

}
