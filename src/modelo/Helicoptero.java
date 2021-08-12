
package modelo;


public class Helicoptero extends Vehiculo_aereo {
    private int helice, rotor;

    public Helicoptero(int helice, int rotor, int ventanas, int puertas, String tipo, String motor, String color, String marca, int asientos, int faros) {
        super(ventanas, puertas, tipo, motor, color, marca, asientos, faros);
        this.helice = helice;
        this.rotor = rotor;
    }

    public int getHelice() {
        return helice;
    }

    public void setHelice(int helice) {
        this.helice = helice;
    }

    public int getRotor() {
        return rotor;
    }

    public void setRotor(int rotor) {
        this.rotor = rotor;
    }
    @Override
    public void arrancar(){}
    @Override
    public void acelerar(){}
    @Override
    public void desacelerar(){}
    @Override
    public void apagar(){}
    @Override
    public void elevarse(){}
    @Override
    public void aterrizar(){}
    @Override
    public void estabilizar(){}
    
    public void girar_eje(){}
     @Override
    public String[] agregar(){
        String datos[] = new String[17];
        datos[0] = getTipo();
        datos[1] = getMotor();
        datos[2] = getColor();
        datos[3] = getMarca();
        String sasientos = Integer.toString(getAsientos());
        datos[4] = sasientos;
        String sfaros = Integer.toString(getFaros());
        datos[5] = sfaros;
        datos[6] = "-";
        datos[7] = "-";
        String snehumaticos = "-";
        datos[8] = snehumaticos;
        String sventanas = Integer.toString(getVentanas());
        datos[9] = sventanas;
        String spuertas = Integer.toString(getPuertas());
        datos[10] = spuertas;
        datos[11] = "-";
        datos[12] = "-";
        datos[13] = "-";
        datos[14] = "-";
        String shelice = Integer.toString(getHelice());
        datos[15] = shelice;
        String srotor = Integer.toString(getRotor());
        datos[16] = srotor;
        return datos;
    }
}
