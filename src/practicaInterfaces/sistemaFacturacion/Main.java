package practicaInterfaces.sistemaFacturacion;

public class Main {
    public static void main(String[] args) {
        Compra c1 = new Compra(15.70, new TarjetaCredito(), new FacturaFisica());
        c1.efectuarCompra();
        Compra c2 = new Compra(52.90, new PayPal(), new FacturaElectronica());
        c2.efectuarCompra();
        Compra c3 = new Compra(118.13, new TransferenciaBancaria(), new FacturaElectronica());
        c3.efectuarCompra();
        Compra c4 = new Compra(-23.18, new PayPal(), new FacturaElectronica());
        c4.efectuarCompra();
        Compra c5 = new Compra(0, new PayPal(), new FacturaFisica());
        c5.efectuarCompra();
    }
}
