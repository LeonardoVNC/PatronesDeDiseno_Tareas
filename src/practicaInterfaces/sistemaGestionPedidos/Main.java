package practicaInterfaces.sistemaGestionPedidos;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        restaurante.recibirPedido("Hola");
        restaurante.recibirPedido("Mesa");
        restaurante.recibirPedido("Llevar");
        restaurante.recibirPedido("Domicilio");
        Repartidor r = new Motorizado();
        restaurante.contratarRepartidor(r);
        restaurante.recibirPedido("Domicilio");
    }
}
