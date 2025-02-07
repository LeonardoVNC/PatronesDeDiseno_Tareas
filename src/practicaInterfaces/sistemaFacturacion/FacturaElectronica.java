package practicaInterfaces.sistemaFacturacion;

public class FacturaElectronica implements  Facturable{
    @Override
    public void generarFactura() {
        System.out.println("Generada la factura electrónica y reenviada a los interesados");
    }
}
