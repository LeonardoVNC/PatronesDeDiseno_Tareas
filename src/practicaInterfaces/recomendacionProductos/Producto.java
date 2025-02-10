package practicaInterfaces.recomendacionProductos;

public class Producto {
    private String nombre;
    private String categoria;
    private int precio;

    public Producto(String nombre, String categoria, int precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "el producto " + nombre + " de categoria " + categoria + " de precio: " + precio + "Bs";
    }
}
