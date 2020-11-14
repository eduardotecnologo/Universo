/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dao;

/**
 *
 * @author edudeveloper
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import locadora.model.Serie;

public class serieDAO {
    public void cadastrarSerie(Serie serie) throws ExceptionDAO{
        String sql = "insert into serie(titulo,genero,sinopse,duracao) value (?,?,?)";
        PreparedStatement pStatement = null;
        
        try{
        connection = new ConnectionMVC().getConnection();
        pStatement = connection.PreparedStatement(sql);
        }catch(SQLException e){
        
        }
    }
    
}
