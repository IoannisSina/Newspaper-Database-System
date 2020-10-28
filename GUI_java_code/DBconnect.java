import java.sql.*;
import javax.swing.JOptionPane;
public class DBconnect {
    public Connection conn=null;
    public static Connection GetConnection(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_project?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1999");
            //JOptionPane.showMessageDialog(null, "Connected to database");
            return conn;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Failed to connect");
            return null;
        }
    }
    
}
