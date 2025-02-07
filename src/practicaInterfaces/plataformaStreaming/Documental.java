package practicaInterfaces.plataformaStreaming;

public class Documental implements Reproducible{

    private String tema;

    public Documental (String tema) {
        this.tema = tema;
    }
    @Override
    public void reproducir() {
        System.out.println("Se reproduce el documental de " + tema + " 🗺️");
    }

    @Override
    public void pausar() {
        System.out.println("Se pausa el documental de " + tema + " 🐢");
    }

    @Override
    public void detener() {
        System.out.println("Se detiene el documental de " + tema + " 👀");
    }
}
