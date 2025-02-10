package practicaInterfaces.transporteUrbano;

public class Usuario {
    private String nombre;

    public Usuario (String nombre) {
        this.nombre = nombre;
    }

    public void solicitarViaje(TransportePublico transporte, String origen, String destino) {
        System.out.println(transporte + " recoge a " + nombre);
        transporte.iniciarViaje(origen, destino);
        transporte.calcularTarifa();
    }
}
