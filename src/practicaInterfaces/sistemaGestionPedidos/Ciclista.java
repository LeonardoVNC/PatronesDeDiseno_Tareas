package practicaInterfaces.sistemaGestionPedidos;

public class Ciclista implements Repartidor {
    @Override
    public void repartir() {
        System.out.println("Pedido enviado por bici");
    }
}
