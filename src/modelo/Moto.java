
package modelo;


public class Moto extends Vehiculo_terrestre {
    private String horquilla;
    public Moto () {}

    public Moto(String horquilla, String placa, String cilindros, int nehumaticos, String tipo, String motor, String color, String marca, int asientos, int faros) {
        super(placa, cilindros, nehumaticos, tipo, motor, color, marca, asientos, faros);
        this.horquilla = horquilla;
    }

    public String getHorquilla() {
        return horquilla;
    }

    public void setHorquilla(String horquilla) {
        this.horquilla = horquilla;
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
    
    public void  maniobrar (){}
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
        datos[10] = "-";
        datos[11] = "-";
        datos[12] = getHorquilla();
        datos[13] = "-";
        datos[14] = "-";
        datos[15] = "-";
        datos[16] = "-";
        return datos;
    }
}
