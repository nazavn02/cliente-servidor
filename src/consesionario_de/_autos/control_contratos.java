/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consesionario_de._autos;


public class control_contratos {
    
  private sentencias sent;
  
  public control_contratos(){
      sent = new sentencias();
  }
  
  public boolean registrar_contrato(String fecha, String cod_cliente, String cod_docvend, String cod_placa, int valor)
    {   
        
            String datos[] = {fecha, cod_cliente, cod_docvend, cod_placa, Integer.toString(valor)};           
            return sent.ingresar_datos(datos, "insert into contrato(fecha, cod_doccliente, cod_docvend, cod_placa,valor) values(?,?,?,?,?)");
                      
                
    }
  
  public Object[][] datos_cliente(String doc, String campo1, String campo2, String campo3, String campo4, String tabla, String docu, String cod)
     {
        String[] columnas={campo1, campo2, campo3, campo4};
        Object[][] resultado = sent.tablas(columnas, tabla, "select * from "+tabla+", ciudad where id_ciudad = "+cod+" and "+docu+"='"+doc+"';");
        return resultado;
      }
  
  public Object[][] datos_carro(String placa)
     {
        String[] columnas={"descripcion_tipo","color", "descripcion", "modelo" };
        Object[][] resultado = sent.tablas(columnas, "carro", "select * from carro, marca, tipo_carro where cod_marca = id_marca and cod_tipocarro = idtipo_carro and placa='"+placa+"';");
        return resultado;
      }
  
  
}


