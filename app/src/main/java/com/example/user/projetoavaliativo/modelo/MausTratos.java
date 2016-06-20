package com.example.user.projetoavaliativo.modelo;

import com.orm.SugarRecord;

/**
 * Created by User on 17/06/2016.
 */
public class MausTratos extends SugarRecord{

    private String descricaoAnimalDenuncia;
    private String informacaoContato;
    private String cidadeDenuncia;
    private String latitude;
    private String longitude;
    private String Denuncia;

    public MausTratos(String descricaoAnimalDenuncia, String informacaoContato, String cidadeDenuncia, String latitude, String longitude, String denuncia) {
        this.descricaoAnimalDenuncia = descricaoAnimalDenuncia;
        this.informacaoContato = informacaoContato;
        this.cidadeDenuncia = cidadeDenuncia;
        this.latitude = latitude;
        this.longitude = longitude;
        this.Denuncia = denuncia;
    }

    public MausTratos() {
    }

    public String getDescricaoAnimalDenuncia() {
        return descricaoAnimalDenuncia;
    }

    public void setDescricaoAnimalDenuncia(String descricaoAnimalDenuncia) {
        this.descricaoAnimalDenuncia = descricaoAnimalDenuncia;
    }

    public String getInformacaoContato() {
        return informacaoContato;
    }

    public void setInformacaoContato(String informacaoContato) {
        this.informacaoContato = informacaoContato;
    }

    public String getCidadeDenuncia() {
        return cidadeDenuncia;
    }

    public void setCidadeDenuncia(String cidadeDenuncia) {
        this.cidadeDenuncia = cidadeDenuncia;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDenuncia() {
        return Denuncia;
    }

    public void setDenuncia(String denuncia) {
        Denuncia = denuncia;
    }
}
