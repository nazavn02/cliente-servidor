
package consesionario_de._autos;


public class control_cliente extends Controlador {
   private String documento;
   private String tipo;
   private String nombre;
   private String apellidos;
   private String direccion;
   private String sexo;
   private String correo;
   private int ciudad;

   public control_cliente(String documento, String tipo, String nombre, String apellidos, String direccion, String sexo, String correo, int ciudad) {
       this.documento = documento;
       this.tipo = tipo;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.direccion = direccion;
       this.sexo = sexo;
       this.correo = correo;
       this.ciudad = ciudad;
   }

   @Override
   public boolean registrar(String tabla) {
       String datos[] = {documento, tipo, nombre, apellidos, direccion, sexo, correo, Integer.toString(ciudad)};
       return sql.ingresar_datos(datos, "insert into "+tabla+"(No_documento,tipo_doc,nombres_ven,apellidos_ven,direccion_ven,sexo_ven,correo_ven,cod_ciudadvend) values(?,?,?,?,?,?,?,?)");
   }

   @Override
   public Object[][] consulta() {
       String[] columnas={"No_documento","tipo_doc","nombres_ven","apellidos_ven","direccion_ven","sexo_ven","correo_ven","nombre_ciudad"};
       Object[][] datos = sql.tablas(columnas, "vendedor", "select No_documento,tipo_doc,nombres_ven,apellidos_ven,direccion_ven,sexo_ven, correo_ven,nombre_ciudad from vendedor,ciudad where cod_ciudadvend=id_ciudad;");
       return datos;
   }
}
   
   

