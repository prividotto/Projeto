package com.example.user.projetoavaliativo.adocao;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;

import com.example.user.projetoavaliativo.R;
import com.example.user.projetoavaliativo.modelo.Adocao;

public class CadastrarAdocao extends AppCompatActivity {

    private Adocao adocao;

    //DONO DO BICHO
    private EditText nome;
    private EditText telefone;
    private EditText email;
    private EditText cidade;
    private EditText estado;

    //ANIMAL
    private EditText nomeAnimal;
    private EditText especie;
    private EditText cor;
    private EditText raca;
    private EditText porte;
    private EditText idade;
    private EditText castrado;
    private EditText descricao;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_adocao);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //RECUPERANDO CAMPOS HUMANO
        this.nome = (EditText) findViewById(R.id.id_nome_dono);
        this.telefone = (EditText) findViewById(R.id.id_telefone);
        this.email = (EditText) findViewById(R.id.id_email);
        this.cidade = (EditText) findViewById(R.id.id_cidade);
        this.telefone = (EditText) findViewById(R.id.id_telefone);
        this.estado = (EditText) findViewById(R.id.id_estado);

        //RECUPERANDO CAMPOS ANIMAL
        this.nomeAnimal = (EditText)findViewById(R.id.id_nome_animal);
        this.raca = (EditText) findViewById(R.id.id_raca);
        this.especie = (EditText) findViewById(R.id.id_telefone);
        this.porte = (EditText) findViewById(R.id.id_email);
        this.idade = (EditText) findViewById(R.id.id_cidade);
        this.castrado = (EditText) findViewById(R.id.id_telefone);
        this.cor = (EditText) findViewById(R.id.id_estado);
        this.descricao = (EditText) findViewById(R.id.id_descricao);

    }


    //ESTE MÉTODO SERÁ CHAMADO PELO BOTÃO E VAI VERIFICAR SE OS CAMPOS NOME - TELEFONE - DESCRIÇÃO ESTÃO VAZIOS.
    //SE ESTIVEREM PREENCHIDOS CADASTRA. SE ESTIVERE VAZIO EXIBE MENSAGEM DE ERRO.

    public void salvarAdocao(View view){
        if(!TextUtils.isEmpty(nome.getText())){
            if(!TextUtils.isEmpty(telefone.getText())){
                if(!TextUtils.isEmpty(descricao.getText())){

                    //SETANDO OS CAMPOS DO HUMANO
                    adocao.setNome(nome.getText().toString());
                    adocao.setTelefone(telefone.getText().toString());
                    adocao.setEmail(email.getText().toString());
                    adocao.setCidade(cidade.getText().toString());
                    adocao.setEstado(estado.getText().toString());

                    //SETANDO OS CAMPOS DO ANIMAL
                    adocao.setNomeAnimal(nomeAnimal.getText().toString());
                    adocao.setCor(cor.getText().toString());
                    adocao.setEspecie(especie.getText().toString());
                    adocao.setRaca(raca.getText().toString());
                    adocao.setDescricao(descricao.getText().toString());
                    adocao.setRaca(raca.getText().toString());
                    adocao.setCastrado(castrado.getText().toString());
                    adocao.setIdade(idade.getText().toString());
                    adocao.save();

                }else{
                    descricao.requestFocus();
                    descricao.setError("Campo Descrição Obrigatório");
                }
            }else{
                telefone.requestFocus();
                telefone.setError("Campo Telefone Obrigatório");
            }
        }else{
            nome.requestFocus();
            nome.setError("Campo Nome Obrigatório");
        }

    }

}
