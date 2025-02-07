package practicaInterfaces.sistemaFacturacion;

public class PayPal implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        if (monto >= 0) {
            System.out.println("Enviada solicitud de pago por PayPal para " + monto + "Bs, pago registrado en las transferencias recientes");
        } else {
            System.out.println("El monto debe ser positivo");
        }
    }
}
