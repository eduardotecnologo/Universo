package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edudeveloper
 */
public class Connect {
    private final String db = "dbHealth";
    private final String user = "root";
    private final String pass = "secret";
    private final String url = "jdbc:mysql://127.0.0.1:3306/" + db;
    private Connection con = null;
    
    public Connection getConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            return con;
   }
}

