/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consesionario_de._autos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class conx_bd {
    private final String url = "jdbc:mysql://localhost/consesionario";
    PreparedStatement psPrepararSentencia;
    Connection con = null;
   

    
    public conx_bd() {
     try{  
        
         Class.forName("com.mysql.jdbc.Driver");         
         con = DriverManager.getConnection(url,"root","camila");
         if (con!=null){
            System.out.println("Conexion con consesionario OK");
         }
      }
         catch(SQLException e)
         {
         System.out.println(e);
         }
         catch(ClassNotFoundException e)
         {
          System.out.println(e);
         }
    }
     /**
     *
     * @return
     */
    public Connection conectado(){
      return con;
}

    public void desconectar(){
      con = null;
      System.out.println("Conexion terminada");

    } 
}
