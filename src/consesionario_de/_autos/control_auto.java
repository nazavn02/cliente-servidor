
package consesionario_de._autos;


public class control_auto extends vehiculos {
    
    private final sentencias sent;
    private String placa;
    private int codCiudadCarro;
    private int codMarca;
    private int codTipoCarro;
    private String motor;

    public control_auto(){
        sent = new sentencias();
    }
    
    public boolean registrar_auto(String placa, int cod_ciudadcarro, int cod_marca, int cod_tipocarro, int modelo, String motor, String color)
    {   
        
            String datos[] = {placa,Integer.toString(cod_ciudadcarro), Integer.toString(cod_marca),Integer.toString(cod_tipocarro),Integer.toString(modelo),motor, color};           
            return sent.ingresar_datos(datos, "insert into carro(placa,cod_ciudadcarro,cod_marca,cod_tipocarro,modelo,motor,color) values(?,?,?,?,?,?,?)");
                      
                
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCodCiudadCarro() {
        return codCiudadCarro;
    }

    public void setCodCiudadCarro(int codCiudadCarro) {
        this.codCiudadCarro = codCiudadCarro;
    }

    public int getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
    }

    public int getCodTipoCarro() {
        return codTipoCarro;
    }

    public void setCodTipoCarro(int codTipoCarro) {
        this.codTipoCarro = codTipoCarro;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

}