
package Datos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Cristina
 */
public class ConectarBD {
    
    String driver="com.mysql.jdbc.Driver";
    String user="root";
    String pass="";
    String url="jdbc:mysql://localhost:3306/sistemaventa";
    
    Connection cn;
    
    public Connection conexion(){
        try {
            Class.forName(driver);
            cn= (Connection)DriverManager.getConnection(url,user,pass);
            System.out.println("conectado");
        } catch (Exception e) {
            System.out.println("error");
            
        }
                
        return cn;
    }
    
}
