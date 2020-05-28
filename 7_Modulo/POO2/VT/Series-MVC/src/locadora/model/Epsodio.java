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
public class Epsodio {
    private Integer codEpsodio;
    private String name;
    private String duracao;
    private ArrayList<Serie> series = new ArrayList<Serie>();
}
