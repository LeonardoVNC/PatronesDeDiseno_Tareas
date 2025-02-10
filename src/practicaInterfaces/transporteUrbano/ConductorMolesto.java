package practicaInterfaces.transporteUrbano;

public class ConductorMolesto implements Conductor {

    @Override
    public void aceptarPasajero() {
        System.out.println("El conductor acepta la petición del ahora pasajero de mala gana");
    }

    @Override
    public void finalizarViaje() {
        System.out.println("El conductor agradece que el trayecto finalmente haya terminado");
    }
}
