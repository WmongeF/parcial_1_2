
package modelo;


abstract class Vehiculo_aereo extends Vehiculo {
    private int ventanas, puertas;
    public Vehiculo_aereo (){}

    public Vehiculo_aereo(int ventanas, int puertas, String tipo, String motor, String color, String marca, int asientos, int faros) {
        super(tipo, motor, color, marca, asientos, faros);
        this.ventanas = ventanas;
        this.puertas = puertas;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    @Override
    public void arrancar(){}
    @Override
    public void acelerar(){}
    @Override
    public void desacelerar(){}
    @Override
    public void apagar(){}
    
    public void elevarse(){}
    public void aterrizar(){}
    public void estabilizar(){}
    @Override
    public String [] agregar(){
        String datos[]= new String [17];
        return datos;
    }
}
