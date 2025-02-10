package practicaInterfaces.recomendacionProductos;

import java.util.LinkedList;
import java.util.List;

public class SistemaRecomendaciones {
    private List<Producto> productos = new LinkedList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void recomendar(Recomendable r) {
        r.obtenerRecomendaciones(productos);
    }
}
