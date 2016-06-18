package com.example.user.projetoavaliativo.modelo;

import com.orm.SugarRecord;

/**
 * Created by User on 17/06/2016.
 */
public class Adocao extends SugarRecord{


    //Informações do dono do animal
    private String nome;
    private String telefone;
    private String email;
    private String cidade;
    private String estado;

    //Informações do Animal
    private String nomeAnimal;
    private String idade;
    private String raca;
    private String porte;
    private String cor;
    private String castrado;
    private String especie;
    private String descricao;

    public Adocao() {
    }

    public Adocao(String nome, String telefone, String email, String cidade, String estado, String nomeAnimal, String idade, String raca, String porte, String cor, String castrado, String especie, String descricao) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
        this.estado = estado;
        this.nomeAnimal = nomeAnimal;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.cor = cor;
        this.castrado = castrado;
        this.especie = especie;
        this.descricao = descricao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCastrado() {
        return castrado;
    }

    public void setCastrado(String castrado) {
        this.castrado = castrado;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
