package practicaInterfaces.transporteUrbano;

public class Main {
    public static void main(String[] args) {
        Usuario jj = new Usuario("Jose Juan");
        ConductorMolesto rr = new ConductorMolesto();
        Taxi t = new Taxi("1181-CRB",rr);
        Bus b = new Bus("3231-SHB");
        BicicletaCompartida bc = new BicicletaCompartida();

        jj.solicitarViaje(t, "8 de Calacoto", "Plaza del Estudiante");
        jj.solicitarViaje(b, "Plaza del Estudiante", "Correos");
        jj.solicitarViaje(bc, "Correos", "San Francisco");
    }
}
