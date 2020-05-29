/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.util.ArrayList;

/**
 *
 * @author edudeveloper
 */
public class Serie {
    private Integer codSerie;
    private String titulo;
    private String genero;
    private String sinopse;
    private String duracao;
    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Epsodio> epsodios = new ArrayList<Epsodio>();

//    public Serie(String titulo, String genero, String sinopse, Integer duracao) {
//        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
//    }

    public Integer getCodSerie() {
        return codSerie;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getDuracao() {
        return duracao;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Epsodio> getEpsodios() {
        return epsodios;
    }

    public void setCodSerie(Integer codSerie) {
        this.codSerie = codSerie;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void setEpsodios(ArrayList<Epsodio> epsodios) {
        this.epsodios = epsodios;
    }

    
    
    public void cadastrarSerie(Serie serie){
    
    }
}
