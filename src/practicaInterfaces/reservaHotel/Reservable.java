package practicaInterfaces.reservaHotel;

public interface Reservable {
    public void reservar(String fecha, Usuario usr);
    public void cancelarReserva(String fecha, Usuario usr);
}
