package practicaInterfaces.plataformaStreaming;

public class Pelicula implements Reproducible{

    private int duracion;

    public Pelicula (int duracion) {
        this.duracion = duracion;
    }
    @Override
    public void reproducir() {
        System.out.println("Se reproduce una película que dura " + duracion + " minutos 👀");
    }

    @Override
    public void pausar() {
        System.out.println("Ve por palomitas, pausa 🦆");
    }

    @Override
    public void detener() {
        System.out.println("Se detiene la peli 👍");
    }
}
