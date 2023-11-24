/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consesionario_de._autos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class sentencias {
  private conx_bd con;
  PreparedStatement ps;
  ResultSet res;

  public sentencias() {
      con = new conx_bd();
  }

  public boolean ingresar_datos(String datos[], String insert){
    boolean estado = false;
     try {
          ps = con.conectado().prepareStatement(insert);
          for(int i=0; i<=datos.length-1;i++){
              ps.setString(i+1, datos[i]);
          }
          ps.execute();
          ps.close();
          estado = true;
       }catch(SQLException e){
       System.out.println(e);
    }
     return estado;
 }

  public Object[][] tablas(String columnas[], String nombreTabla, String select){
    Object[][] datos = null;
    try {
          ps = con.conectado().prepareStatement(select);
          res = ps.executeQuery();
          res.last();
          int filas = res.getRow();
          res.beforeFirst();
          datos = new Object[filas][columnas.length];
          for(int i=0;i<filas;i++){
              res.next();
              for(int j=0;j<columnas.length;j++){
                 datos[i][j] = res.getObject(columnas[j]);
              }
          }
          res.close();
          ps.close();
       }catch(SQLException e){
       System.out.println(e);
    }
     return datos;
 }


     
     public String datos_string(String nombre_columna, String sentenciasql){
        
    String datos ="";
      try{
         ps = con.conectado().prepareStatement(sentenciasql);
         res = ps.executeQuery();
         while(res.next()){
            datos = res.getString(nombre_columna);
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return datos;
    }
     
     public Object[] poblar_combox(String tabla, String nombrecol, String sql){
      int registros = 0;      
      try{
         ps = con.conectado().prepareStatement("SELECT count(*) as total FROM " + tabla);
         res = ps.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }

    Object[] datos = new Object[registros];
      try{
         ps = con.conectado().prepareStatement(sql);
         res = ps.executeQuery();
         int i = 0;
         while(res.next()){
            datos[i] = res.getObject(nombrecol);
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return datos;
 }
     
     public boolean existencias(String campo, String from_where){
     int registros = 0;
     try{
         ps = con.conectado().prepareStatement("SELECT count("+campo+") as total  " + from_where);
         res = ps.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
     
     if (registros >0)
     {return true;
     }
     else
     {
         return false;
     }
  }
}
