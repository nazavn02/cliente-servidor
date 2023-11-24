/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consesionario_de._autos;


public class control_vendedor extends persona_consesionario{
    
    public control_vendedor(String documento, String tipo, String nombre,  String apellidos, String direccion, 
            String sexo, String correo,int ciudad){
           super (documento, tipo, nombre,  apellidos, direccion,sexo,correo,ciudad);
        
    }
    
    public boolean registrar_vend(String tabla)
    {   
        
            String datos[] = {documento, tipo, nombre,  apellidos, direccion,sexo,correo,Integer.toString(ciudad)};           
            return sql.ingresar_datos(datos, "insert into "+tabla+"(No_documento,tipo_doc,nombres_ven,apellidos_ven,direccion_ven,sexo_ven,correo_ven,cod_ciudadvend) values(?,?,?,?,?,?,?,?)");
                     
                
    }
     public Object[][] consulta_vendedor(){
        String[] columnas={"No_documento","tipo_doc","nombres_ven","apellidos_ven","direccion_ven","sexo_ven","correo_ven","nombre_ciudad"};
        Object[][] datos = sql.tablas(columnas, "vendedor", "select No_documento,tipo_doc,nombres_ven,apellidos_ven,direccion_ven,sexo_ven, correo_ven,nombre_ciudad from vendedor,ciudad where cod_ciudadvend=id_ciudad;");
        return datos;
    }
    
}
