package dao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author edudeveloper
 */
public class ConnectDb {
    
    // Variáveis de ambientes
    private static final String driverClass = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:8889/listaseries";
    private static final String user = "root";
    private static final String pass = "root";
    
    // Método para conexão   
    public static Connection openConnect() throws SQLException, ClassNotFoundException{
        Connection con = null;
        
        try {
            Class.forName(driverClass);
            con = DriverManager.getConnection(url, user,pass);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
            
        } catch (HeadlessException | SQLException error) {
            JOptionPane.showMessageDialog(null, "Error ao conectar ao banco de dados!"+ error);
        }
        
        
        return con;
    }
    
}
