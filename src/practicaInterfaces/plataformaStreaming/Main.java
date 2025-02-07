package practicaInterfaces.plataformaStreaming;

public class Main {
    public static void main(String[] args) {
        Reproducible d = new Documental("Ballenas");
        Reproducible p = new Pelicula(9);
        Reproducible s = new Serie(11813);
        Usuario u = new Usuario();

        u.agregarFavorito(d);
        u.agregarFavorito(p);
        u.agregarFavorito(s);
        u.reproducirFavoritos();
    }
}