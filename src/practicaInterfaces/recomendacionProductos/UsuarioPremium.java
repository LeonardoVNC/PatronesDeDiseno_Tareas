package practicaInterfaces.recomendacionProductos;

import java.util.List;

public class UsuarioPremium implements Recomendable{
    private int precioPromedio;

    public UsuarioPremium (int precioPromedio) {
        this.precioPromedio = precioPromedio;
    }

    @Override
    public void obtenerRecomendaciones(List<Producto> productos) {
        for (int i = 0; i<productos.size(); i++) {
            if (productos.get(i).getPrecio() >= precioPromedio) {
                System.out.println(this + " ha recibido como recomendación " + productos.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "Un usuario premium";
    }
}
