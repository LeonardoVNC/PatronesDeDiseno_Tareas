package practicaInterfaces.sistemaInventario;

public class Electronico implements Producto {
    private String nombre;
    private int id_inventario;
    private int precioUnitario;
    private int cantidadStock;

    public Electronico(String nombre, int id_inventario, int precioUnitario, int cantidadStock) {
        this.nombre = nombre;
        this.id_inventario = id_inventario;
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
    public String toString(){
        return "electrónico de id " + id_inventario + " " + nombre;
    }
}
