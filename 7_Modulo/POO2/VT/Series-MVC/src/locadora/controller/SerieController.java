/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.controller;

import locadora.model.Serie;

/**
 *
 * @author edudeveloper
 */
public class SerieController {
    public boolean cadastrarSerie(String titulo, String genero, String sinopse, Integer duracao){
        if(titulo != null && titulo.length() > 0 && genero != null && genero.length() > 0 && sinopse != null && sinopse.length() > 0 && duracao > 0){
        Serie serie = new Serie(titulo,genero,sinopse,duracao);
        serie.cadastrarSerie(serie);
        return true;
        }
        return false;
    }
}
