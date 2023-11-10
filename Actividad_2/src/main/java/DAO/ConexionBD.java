/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author omar.leal
 */
public class ConexionBD {
    
    
    private Connection conexion;
    
    public ConexionBD(String url, String usuario, String contrasena)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
              this.conexion = DriverManager.getConnection(url, usuario, contrasena);
              
              if(conexion != null)
              {
                  System.out.println("Conexión exitosa");
              }else
              {
                  System.out.println("Falló la conexión");
              }
        }catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public int ejecutarConsulta(String consulta)
    {
        ResultSet resultado = null;
        Statement statement = null;
        
        
            int filasAfectadas = 0;
        try {
            statement = conexion.createStatement();
            filasAfectadas = statement.executeUpdate(consulta);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return filasAfectadas;
    }
    
     public ResultSet ejecutarSelect(String consulta)
    {
        ResultSet resultado = null;
        Statement statement = null;
        
        
        try {
            statement = conexion.createStatement();
            resultado = statement.executeQuery(consulta);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return resultado;
    }
    

    
}
