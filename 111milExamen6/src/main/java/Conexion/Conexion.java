
package Conexion;
import java.sql.*;
import java.util.*;

public class Conexion 
{
    private static Conexion instance;
    private Connection cn;
    
    public static Conexion getInstance()
    {
        if(instance == null)
        {
            instance = new Conexion();
        }
        return instance;
    }
    private Conexion()
    {
        try{
            cn = DriverManager.getConnection("jdbc/mysql://localhost:3306/", "root", "");
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public void ejecutarSQL(String sql)
    {
        try{
            cn.createStatement().executeQuery(sql);
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public ResultSet consultarSQL(String sql)
    {
        try{
            Statement st = cn.createStatement();
            ResultSet res = st.executeQuery(sql);
            return res;
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return  null;
    }
    
    
}
