package practicaInterfaces.sistemaFacturacion;

public class FacturaFisica implements Facturable {
    @Override
    public void generarFactura() {
        System.out.println("Se imprimió la factura satisfactoriamente");
    }
}
