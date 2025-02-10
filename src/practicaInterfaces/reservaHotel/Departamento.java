package practicaInterfaces.reservaHotel;

import java.util.HashMap;
import java.util.Map;

public class Departamento implements Reservable {
    private Map reservas = new HashMap();
    private String nombre;
    private int numero;

    public Departamento(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public void reservar(String fecha, Usuario usr) {
        if (isFechaDisponible(fecha)) {
            System.out.println("La reserva se ha completado con éxito");
            reservas.put(fecha, usr);
        } else {
            System.out.println("No se ha podido completar la reserva, la fecha ya está ocupada");
        }
    }

    @Override
    public void cancelarReserva(String fecha, Usuario usr) {
        if (reservas.containsKey(fecha) && reservas.get(fecha) == usr) {
            reservas.remove(fecha, usr);
            System.out.println("La reserva se ha retirado satisfactoriamente");
        } else if (reservas.containsKey(fecha)  && reservas.get(fecha) != usr) {
            System.out.println("Esta reserva no te pertenece");
        } else {
            System.out.println("No hay registro de la reserva " + fecha + " en " + this);
        }
    }

    public Boolean isFechaDisponible(String fecha) {
        return !reservas.containsKey(fecha);
    }

    @Override
    public String toString() {
        return "Departamento " + nombre + " piso " + numero;
    }
}
