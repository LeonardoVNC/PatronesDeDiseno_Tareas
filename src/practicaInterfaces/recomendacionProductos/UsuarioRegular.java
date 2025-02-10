package practicaInterfaces.recomendacionProductos;

import java.util.List;

public class UsuarioRegular implements Recomendable {
    private String categoriaFavorita;

    public UsuarioRegular (String categoriaFavorita) {
        this.categoriaFavorita = categoriaFavorita;
    }
    @Override
    public void obtenerRecomendaciones(List<Producto> productos) {
        for (int i = 0; i<productos.size(); i++) {
            if (productos.get(i).getCategoria().equals(categoriaFavorita)) {
                System.out.println(this + " ha recibido como recomendación " + productos.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "Un usuario regular";
    }
}
