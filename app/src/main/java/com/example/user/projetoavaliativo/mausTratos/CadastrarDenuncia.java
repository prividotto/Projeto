package com.example.user.projetoavaliativo.mausTratos;

import android.net.wifi.WifiEnterpriseConfig;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.projetoavaliativo.R;
import com.example.user.projetoavaliativo.modelo.MausTratos;

public class CadastrarDenuncia extends AppCompatActivity {

    private MausTratos mausTratos;
    private TextView descricaoAnimalDenuncia;
    private TextView informacaoContato;
    private TextView cidadeDenuncia;
    private TextView latitude;
    private TextView longitude;
    private TextView denuncia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_denuncia);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        this.descricaoAnimalDenuncia = (EditText) findViewById(R.id.id_descricao_animal_denuncia);
        this.informacaoContato = (EditText) findViewById(R.id.contato_denuncia);
        this.cidadeDenuncia = (EditText) findViewById(R.id.cidade_denuncia);
        this.latitude = (EditText) findViewById(R.id.latitude_denuncia);
        this.longitude = (EditText) findViewById(R.id.longitude_denuncia);
        this.denuncia = (EditText) findViewById(R.id.denuncia);


    }

    public void salvarDenuncia() {
        if (!TextUtils.isEmpty(descricaoAnimalDenuncia.getText())) {
            if (!TextUtils.isEmpty(latitude.getText())) {
                if (!TextUtils.isEmpty(longitude.getText())) {
                    if (!TextUtils.isEmpty(denuncia.getText())) {

                        mausTratos.setDescricaoAnimalDenuncia(descricaoAnimalDenuncia.getText().toString());
                        mausTratos.setLatitude(latitude.getText().toString());
                        mausTratos.setLongitude(longitude.getText().toString());
                        mausTratos.setDenuncia(denuncia.getText().toString());
                        mausTratos.save();

                    }else{
                        denuncia.requestFocus();
                        denuncia.setError("Campo Denuncia Obrigatório");
                    }
                }else{
                    longitude.requestFocus();
                    longitude.setError("Campo Longitude Obrigatório");
                }
            }else {
           latitude.requestFocus();
                latitude.setError("Campo Latitude Obrigatório");
            }
        }else {
            descricaoAnimalDenuncia.requestFocus();
            descricaoAnimalDenuncia.setError("Campo Descrição do Animal Obrigatório");
        }


    }
}