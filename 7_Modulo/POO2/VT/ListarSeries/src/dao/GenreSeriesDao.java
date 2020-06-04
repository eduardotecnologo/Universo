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

    @Override
    public void saveDao(Object... value) {
        GenreSeriesModel gsm = (GenreSeriesModel)value[0];
        gsm.getDescricao();
        System.out.println("Estou no DAO" +gsm.getDescricao());
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
