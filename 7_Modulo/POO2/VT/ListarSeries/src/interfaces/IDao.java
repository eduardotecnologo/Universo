package interfaces;

import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author edudeveloper
 */
public interface IDao {
    public void saveDao(Object... value);
    public void deleteDao(int id);
    public void consultDao(Object... value) throws SQLException;
    public void chargeComboBoxDao(JComboBox itens) throws SQLException;  
}
