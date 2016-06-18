package com.example.user.projetoavaliativo.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.user.projetoavaliativo.R;
import com.example.user.projetoavaliativo.modelo.MausTratos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 18/06/2016.
 */
public class AdapterDenuncia extends BaseAdapter {

    List<MausTratos> listaMausTratos = new ArrayList<>();
    Activity activity;


    @Override
    public int getCount() {
        return listaMausTratos.size();
    }

    @Override
    public Object getItem(int i) {
        return listaMausTratos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listaMausTratos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(activity).inflate(R.layout.adapter_denuncia, viewGroup, false);
        MausTratos mausTratos = listaMausTratos.get(i);

        TextView tv_descriacao = (TextView) view.findViewById(R.id.descricao_Animal);
        tv_descriacao.setText(mausTratos.getDescricaoAnimalDenuncia());

        TextView tv_cidade =(TextView)view.findViewById(R.id.cidade_denuncia);
        tv_cidade.setText(mausTratos.getCidadeDenuncia());

        return view;
        }


}
