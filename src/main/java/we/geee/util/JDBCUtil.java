package we.geee.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://walab.handong.edu:3306/p2_21900286","p2_21900286","aitieN2Tha");
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}
