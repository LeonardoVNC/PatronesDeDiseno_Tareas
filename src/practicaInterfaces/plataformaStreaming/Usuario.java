package practicaInterfaces.plataformaStreaming;

import java.util.LinkedList;

public class Usuario {
    private LinkedList<Reproducible> favoritos;

    public Usuario () {
        favoritos = new LinkedList<Reproducible>();
    }

    public void agregarFavorito(Reproducible favorito) {
        favoritos.add(favorito);
    }

    public void reproducirFavoritos () {
        for (int i = 0; i < favoritos.size(); i++) {
            favoritos.get(i).reproducir();
        }
    }
}
