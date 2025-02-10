package practicaInterfaces.recomendacionProductos;

public class Main {
    public static void main(String[] args) {
        SistemaRecomendaciones sist = new SistemaRecomendaciones();
        Producto p1 = new Producto("Patito de goma", "salud", 30);
        Producto p2 = new Producto("Calculadora", "escolar", 260);
        Producto p3 = new Producto("Cuaderno", "escolar", 70);
        Producto p4 = new Producto("Paquete de primeros auxilios", "salud", 340);
        Producto p5 = new Producto("Paquete de alcohol medicinal", "salud", 420);
        Producto p6 = new Producto("Botella de agua", "comestibles", 8);
        sist.agregarProducto(p1);
        sist.agregarProducto(p2);
        sist.agregarProducto(p3);
        sist.agregarProducto(p4);
        sist.agregarProducto(p5);
        sist.agregarProducto(p6);
        UsuarioPremium up = new UsuarioPremium(100);
        UsuarioRegular ur = new UsuarioRegular("salud");

        sist.recomendar(up);
        sist.recomendar(ur);
    }
}
