package dao;

import interfaces.IDao;
import java.sql.SQLException;
import javax.swing.JComboBox;
import model.GenreSeriesModel;

/**
 *
 * @author edudeveloper
 */
public class GenreSeriesDao implements IDao{
    String sql;

    @Override
    public void saveDao(Object... value) {
        GenreSeriesModel gsm = (GenreSeriesModel)value[0];
        sql = "INSERT INTO genre_serie (descricao) VALUES (?)";
        sql = "UPDATE genre_serie SET descricao=? WHERE id_genre_serie=?";
        
       
    }

    @Override
    public void deleteDao(int id) {
        
    }

    @Override
    public void consultDao(Object... value) throws SQLException {
        
    }

    @Override
    public void chargeComboBoxDao(JComboBox itens) throws SQLException {
       
    }
    
}
