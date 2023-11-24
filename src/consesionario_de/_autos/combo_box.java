
package consesionario_de._autos;


public class combo_box {
    
    private sentencias sen;
    
    public combo_box(){
     sen = new sentencias();
    }
    
    public Object[] combox(String tabla, String campo)
     {
        return sen.poblar_combox(tabla, campo, "select "+campo+" from "+tabla+";");
     }
    
    public Object[][] ingresa_cod(String campo, String id_campo, String tabla, String col)
     { 
       String[] columnas = {id_campo};
       Object[][] result = sen.tablas(columnas,tabla, "select * from "+tabla+" where "+col+"='"+campo+"';");
       return result;
    }
    
}
