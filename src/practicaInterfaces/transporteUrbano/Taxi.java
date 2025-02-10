package practicaInterfaces.transporteUrbano;

import java.util.Random;

public class Taxi implements TransportePublico {
    private String matricula;
    private Conductor conductor;
    private Random rnd = new Random();

    public Taxi (String matricula, Conductor conductor) {
        this.matricula = matricula;
        this.conductor = conductor;
    }

    @Override
    public void iniciarViaje(String origen, String destino) {
        conductor.aceptarPasajero();
        System.out.println(this + " parte desde " + origen + " hasta " + destino);
    }

    @Override
    public void calcularTarifa() {
        conductor.finalizarViaje();
        System.out.println(this + " hoy amaneció de buenas, y solo va a cobrar " + rnd.nextInt(10,40) +"Bs");
    }

    @Override
    public String toString() {
        return "El Taxi de matrícula " + matricula;
    }
}
