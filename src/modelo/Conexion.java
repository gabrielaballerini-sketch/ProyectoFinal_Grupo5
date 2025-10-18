/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB="proyectocinegrupon5";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection miconexion;

    public Conexion() {
    }
    
    public static Connection getconexion(){
        
        
        if(miconexion==null){
        
        try{
        Class.forName ("org.mariadb.jdbc.Driver");
        
    
                miconexion=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD );
                
               
          
          JOptionPane.showMessageDialog(null, "Conexion exitosa");
        
        
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al cargar driver");
        
        
        }
            
            
              catch (SQLException ex) {
                  
                  JOptionPane.showMessageDialog(null," Error al conectarse a la base de datos");
                
                 
            }
             
        }
        
       
        return miconexion;
    
    }
    
    
    
}
