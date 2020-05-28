/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.util.Date;

/**
 *
 * @author edudeveloper
 */
public class Item {
    private Integer codItem;
    private double preco;
    private String tipo;
    private Serie serie;
    private Cliente cliente;
    private Date dataLocacao;
    private Date dataDevolucao;
}
