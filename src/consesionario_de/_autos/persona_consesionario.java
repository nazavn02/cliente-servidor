/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consesionario_de._autos;


public class persona_consesionario {
     public sentencias sql; 
     protected String documento;
     protected  String tipo;
     protected  String nombre;
     protected  String apellidos;
     protected  String direccion;
     protected  String sexo;
     protected String correo;    
     protected  int ciudad;
     
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public int getCiudad() {
        return ciudad;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }
    
    public persona_consesionario(String documento, String tipo, String nombre,  String apellidos, String direccion, 
            String sexo, String correo, int ciudad){
        
        this.documento=documento;
        this. tipo=tipo;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.sexo=sexo;
        this.correo=correo;        
        this.ciudad=ciudad;
         sql = new sentencias();
    }
    
    public boolean registrar(String tabla)
    {               
        
            String datos[] = {documento, tipo, nombre,  apellidos, direccion,sexo,correo,Integer.toString(ciudad)};           
            return sql.ingresar_datos(datos, "insert into "+tabla+"(documento,tipo_documento,nombres,apellidos,direccion,sexo,correo,cod_ciudad) values(?,?,?,?,?,?,?,?)");
                      
                
    }
    
    
    
    
    
    
     
     
     
     
             
     
}
