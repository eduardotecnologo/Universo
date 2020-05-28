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
    
}
