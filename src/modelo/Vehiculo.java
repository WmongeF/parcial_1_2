
package modelo;


abstract class Vehiculo {
    private String tipo, motor, color,marca;
    private int  asientos, faros;
    Vehiculo (){}

    public Vehiculo(String tipo, String motor, String color, String marca, int asientos, int faros) {
        this.tipo = tipo;
        this.motor = motor;
        this.color = color;
        this.marca = marca;
        this.asientos = asientos;
        this.faros = faros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getFaros() {
        return faros;
    }

    public void setFaros(int faros) {
        this.faros = faros;
    }
    
    public void arrancar(){}
    public void acelerar(){}
    public void desacelerar(){}
    public void apagar(){}
    public String [] agregar(){
        String datos[]= new String [17];
        return datos;
    }
}
