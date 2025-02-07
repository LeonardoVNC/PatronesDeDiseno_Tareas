package practicaInterfaces.plataformaStreaming;

public class Serie implements Reproducible{
    private int episodios;

    public Serie (int episodios) {
        this.episodios = episodios;

    }
    @Override
    public void reproducir() {
        System.out.println("Se reproduce la serie, en cual cap ibamos loco? Ni idea, solo sé que eran " + episodios + " en total");
    }

    @Override
    public void pausar() {
        System.out.println("Ponganle pausa, voy por papas 🐢");
    }

    @Override
    public void detener() {
        System.out.println("Suficiente por hoy, solo faltan 1451 capitulos");
    }
}
