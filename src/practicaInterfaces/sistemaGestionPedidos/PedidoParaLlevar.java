package practicaInterfaces.sistemaGestionPedidos;

public class PedidoParaLlevar implements Pedido {
    @Override
    public void preparar() {
        System.out.println("Se esta preparando un pedido para llevar");
    }

    @Override
    public void entregar() {
        System.out.println("Se entregó un pedido para llevar");
    }
}
