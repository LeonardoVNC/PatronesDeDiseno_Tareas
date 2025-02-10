package practicaInterfaces.reservaHotel;

public class Main {
    public static void main(String[] args) {
        Usuario jj = new Usuario("Jose Juan");
        Usuario mm = new Usuario("Mickey Mouse");
        Hotel h = new Hotel("Rio Selva",4);
        Departamento d = new Departamento("Las Rosas", 5);
        jj.cancelarReserva(h, "15/06/24");
        jj.hacerReserva(h, "17/04/24");
        mm.hacerReserva(h, "17/04/24");
        mm.cancelarReserva(h, "17/04/24");
        mm.hacerReserva(d, "26/06/24");
        jj.calificar(h, 5);
        mm.calificar(h, 2);
    }
}
