
package modelo;

public class Automovil extends Vehiculo_terrestre {
    private String chasis;
    private int puertas;
    
    public Automovil (){}

    public Automovil(String chasis, int puertas, String placa, String cilindros, int nehumaticos, String tipo, String motor, String color, String marca, int asientos, int faros) {
        super(placa, cilindros, nehumaticos, tipo, motor, color, marca, asientos, faros);
        this.chasis = chasis;
        this.puertas = puertas;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
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
    @Override
    public void frenar(){}
    @Override
    public void encende_faros(){}
    
    public void bajar_ventanas(){}
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
        datos[6] = getPlaca();
        datos[7] = getCilindros();
        String snehumaticos = Integer.toString(getNehumaticos());
        datos[8] = snehumaticos;
        datos[9] = "-";
        String spuertas = Integer.toString(getPuertas());
        datos[10] = spuertas;
        datos[11] = getChasis();
        datos[12] = "-";
        datos[13] = "-";
        datos[14] = "-";
        datos[15] = "-";
        datos[16] = "-";
        return datos;
    }
}
