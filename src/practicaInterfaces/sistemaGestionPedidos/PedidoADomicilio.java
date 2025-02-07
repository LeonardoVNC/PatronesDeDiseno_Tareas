package practicaInterfaces.sistemaGestionPedidos;

public class PedidoADomicilio implements Pedido {
    private Repartidor repartidor;

    public PedidoADomicilio(Repartidor r) {
        this.repartidor = r;
    }

    @Override
    public void preparar() {
        System.out.println("Se esta preparando un pedido a domicilio");
    }

    @Override
    public void entregar() {
        System.out.println("Se preparó la entrega de un pedido a domicilio");
        repartidor.repartir();
    }
}
