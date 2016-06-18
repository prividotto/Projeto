package com.example.user.projetoavaliativo.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.user.projetoavaliativo.R;
import com.example.user.projetoavaliativo.modelo.Adocao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 17/06/2016.
 */
public class AdapterAdocao extends BaseAdapter {

    List<Adocao> listaAdocao = new ArrayList<>();
    Activity activity;

    public AdapterAdocao(List<Adocao> listaAdocao, Activity activity) {
        this.listaAdocao = listaAdocao;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return listaAdocao.size();
    }

    @Override
    public Object getItem(int i) {
        return listaAdocao.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listaAdocao.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(activity).inflate(R.layout.adapter_adocao, viewGroup, false);
        Adocao adocao = listaAdocao.get(i);

        TextView tv_nome = (TextView) view.findViewById(R.id.nome);
        tv_nome.setText(adocao.getNome());

        TextView tv_descriocao = (TextView) view.findViewById(R.id.descricao);
        tv_descriocao.setText(adocao.getDescricao());

        return view;

    }
}
