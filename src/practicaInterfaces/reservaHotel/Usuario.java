package practicaInterfaces.reservaHotel;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void hacerReserva(Reservable r, String fecha) {
        System.out.println(this + " intenta hacer una reservación en " + r + " para el " + fecha);
        r.reservar(fecha, this);
    }

    public void cancelarReserva(Reservable r, String fecha) {
        System.out.println(this + " intenta cancelar una reserva en " + r + " para el " + fecha);
        r.cancelarReserva(fecha, this);
    }

    @Override
    public String toString() {
        return "El usuario " + nombre;
    }

    public void calificar(Calificable c, int estrellas) {
        System.out.println(this+" califica con " + estrellas + " estrellas a " + c);
        c.calificar(estrellas);
    }
}
