package practicaInterfaces.sistemaFacturacion;

public class TransferenciaBancaria implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        if (monto >= 0) {
            System.out.println("Generado el proceso de transferencia de " + monto + "Bs y añadido al extracto de cuenta");
        } else {
            System.out.println("El monto debe ser positivo");
        }
    }
}
