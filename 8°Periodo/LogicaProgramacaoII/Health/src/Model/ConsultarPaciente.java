package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author edudeveloper
 */
public class ConsultarPaciente extends Connect{
       public boolean salvar(Patient pat){
           PreparedStatement ps = null;
           Connection con = getConnect();
           
           String sql = "INSERT INTO health (id,record,name, mothers_name, date_birth, marital_status, race, phone,type, record_date) VALUES(?,?,?,?,?,?,?,?,?,?)";
           try {
               ps = con.prepareStatement(sql);
           } catch (Exception e) {
               
           }
       }
}
