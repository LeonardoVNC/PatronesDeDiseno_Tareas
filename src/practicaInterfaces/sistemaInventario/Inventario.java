package practicaInterfaces.sistemaInventario;

public class Inventario {
    public void comprobarProducto(Producto p) {
        System.out.println("Se analiza el producto " + p);
        System.out.println("Aun se poseen " + p.obtenerStock() + " unidades de " + p);
        System.out.println("El precio unitario de " + p + " es " + p.obtenerPrecio() + "Bs");
    }

    public void verificarAlmacenable(Almacenable a) {
        System.out.println("Se verifica la integridad de " + a);
        a.guardarEnBodega();
    }
}
