package practicaInterfaces.sistemaFacturacion;

public class TarjetaCredito implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        if (monto >= 0) {
            System.out.println("Se procesó el pago por tarjeta de crédito por el monto de " + monto + "Bs");
        } else {
            System.out.println("El monto debe ser positivo");
        }
    }
}
