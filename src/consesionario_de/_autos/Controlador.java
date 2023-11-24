/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consesionario_de._autos;

/**
 *
 * @author guill
 */
public abstract class Controlador {
   protected sentencias sql;

   public Controlador() {
       sql = new sentencias();
   }

   public abstract boolean registrar(String tabla);
   public abstract Object[][] consulta();
}