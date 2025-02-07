package practicaInterfaces.sistemaGestionPedidos;

import java.util.LinkedList;
import java.util.Random;

public class Restaurante {
    private LinkedList<Repartidor> repartidores = new LinkedList<>();
    private Random rnd = new Random();

    public void contratarRepartidor(Repartidor r) {
        repartidores.add(r);
        System.out.println("Se contrato un repartidor");
    }

    public void recibirPedido(String tipo) {
        Pedido pedido = null;
        switch (tipo) {
            case "Llevar"->
                pedido = new PedidoParaLlevar();
            case "Mesa"->
                pedido = new PedidoEnMesa();
            case "Domicilio"-> {
                try {
                    pedido = new PedidoADomicilio(repartidores.get(rnd.nextInt(repartidores.size())));
                } catch (IllegalArgumentException e) {
                    System.out.println("No hay suficientes repartidores, contrata algunos");
                    return;
                }
            }
            default -> {
                System.out.println("Elige una opción de pedido válida (Llevar, Mesa o Domicilio)");
                return;
            }
        }
        pedido.preparar();
        pedido.entregar();
    }
}
