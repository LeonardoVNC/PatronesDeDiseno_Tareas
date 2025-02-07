package practicaInterfaces.sistemaGestionPedidos;

public class Motorizado implements Repartidor{
    @Override
    public void repartir() {
        System.out.println("Pedido enviado a motor ");
    }
}
