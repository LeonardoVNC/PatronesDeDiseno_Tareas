package practicaInterfaces.sistemaFacturacion;

public class Compra {
    private double precio;
    private MetodoPago metodoPago;
    private Facturable tipoFactura;

    public Compra(double precio, MetodoPago metodoPago, Facturable tipoFactura) {
        this.precio = precio;
        this.metodoPago = metodoPago;
        this.tipoFactura = tipoFactura;
    }

    public void efectuarCompra() {
        if (precio >= 0) {
            metodoPago.procesarPago(precio);
            tipoFactura.generarFactura();
        } else {
            System.out.println("El precio debe ser positivo");
        }
    }
}
