
package modelo;


abstract class Vehiculo_terrestre extends Vehiculo {
    private String placa, cilindros;
    private int nehumaticos;
    
    public Vehiculo_terrestre () {}

    public Vehiculo_terrestre(String placa, String cilindros, int nehumaticos, String tipo, String motor, String color, String marca, int asientos, int faros) {
        super(tipo, motor, color, marca, asientos, faros);
        this.placa = placa;
        this.cilindros = cilindros;
        this.nehumaticos = nehumaticos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    public int getNehumaticos() {
        return nehumaticos;
    }

    public void setNehumaticos(int nehumaticos) {
        this.nehumaticos = nehumaticos;
    }

    @Override
    public void arrancar(){}
    @Override
    public void acelerar(){}
    @Override
    public void desacelerar(){}
    @Override
    public void apagar(){}
    
    public void frenar(){}
    public void encende_faros(){}
    @Override
    public String [] agregar(){
        String datos[]= new String [17];
        return datos;
    }
}
