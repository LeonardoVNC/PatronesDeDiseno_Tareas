package practicaInterfaces.sistemaInventario;

import java.time.LocalDate;

public class Alimento implements Producto, Almacenable{
    private String nombre;
    public LocalDate fechaCaducidad;
    private int precioUnitario;
    private int cantidadStock;

    public Alimento(String nombre, LocalDate fechaCaducidad, int precioUnitario, int cantidadStock) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.precioUnitario = precioUnitario;
        this.cantidadStock = cantidadStock;
    }

    @Override
    public int obtenerPrecio() {
        return precioUnitario;
    }

    @Override
    public int obtenerStock() {
        return cantidadStock;
    }

    @Override
    public void guardarEnBodega() {
        if (fechaCaducidad.isAfter(LocalDate.now())) {
            System.out.println(this + " cumple con los requisitos para ser almacenado en la bodega");
        } else {
            System.out.println(this + " ha caducado y debe ser retirado de la bodega");
            retirarDeBodega();
        }
    }

    @Override
    public void retirarDeBodega() {
        System.out.println(this + " se retira de la bodega");
    }

    @Override
    public String toString() {
        return "El grupo de alimentos ("+nombre+")";
    }
}
