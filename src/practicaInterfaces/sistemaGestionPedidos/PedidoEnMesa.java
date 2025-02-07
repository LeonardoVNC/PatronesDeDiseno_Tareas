package practicaInterfaces.sistemaGestionPedidos;

public class PedidoEnMesa implements Pedido {
    @Override
    public void preparar() {
        System.out.println("Se esta preparando un pedido en mesa");
    }

    @Override
    public void entregar() {
        System.out.println("Se entregó un pedido en mesa");
    }
}
