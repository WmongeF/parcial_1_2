
package modelo;

public class Avion extends Vehiculo_aereo {
    private int turbinas, alerones;
    
    public Avion (){}

    public Avion(int turbinas, int alerones, int ventanas, int puertas, String tipo, String motor, String color, String marca, int asientos, int faros) {
        super(ventanas, puertas, tipo, motor, color, marca, asientos, faros);
        this.turbinas = turbinas;
        this.alerones = alerones;
    }

    public int getTurbinas() {
        return turbinas;
    }

    public void setTurbinas(int turbinas) {
        this.turbinas = turbinas;
    }

    public int getAlerones() {
        return alerones;
    }

    public void setAlerones(int alerones) {
        this.alerones = alerones;
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
    
    public void planera(){}
    public void piloto_automatico(){}
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
        String sturbinas = Integer.toString(getTurbinas());
        datos[13] = sturbinas;
        String salerones = Integer.toString(getAlerones());
        datos[14] = salerones;
        datos[15] = "-";
        datos[16] = "-";
        return datos;
    }
}
