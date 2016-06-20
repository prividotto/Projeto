package com.example.user.projetoavaliativo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.user.projetoavaliativo.adocao.ListaAdocao;
import com.example.user.projetoavaliativo.mausTratos.ListaMausTratos;

public class MainActivity extends AppCompatActivity {


    //ESTE MÉTODO É CHAMADO PELO BOTÃO "ADOÇÃO" NA TELA PRINCIPAL E LEVA PARA A ACTIVITY DA LISTA DE ADOÇÃO
    public void cadastroDeAdocao(View view)
    {
        Intent it = new Intent(this,ListaAdocao.class);
        setContentView(R.layout.activity_lista_adocao);
    }


    //ESTE MÉTODO É CHAMADO PELO BOTÃO "DENUNCIAR" NA TELA PRINCIPAL E LEVA PARA A ACTIVITY DA LISTA DE DENUNCIAS
    public void cadastroDeDenuncia (View view)
    {

        Intent it = new Intent(this, ListaMausTratos.class);
        setContentView(R.layout.activity_lista_maus_tratos);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

            }
/*

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
*/
}
