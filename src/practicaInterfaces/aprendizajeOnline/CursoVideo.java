package practicaInterfaces.aprendizajeOnline;

public class CursoVideo implements Curso{
    private String nombre;

    public CursoVideo(String nombre) {
        this.nombre = nombre.toLowerCase().replace(" ", "_")+".mp4";
    }
    @Override
    public void iniciar() {
        System.out.println("Se ha iniciado el video-curso " + this);
    }

    @Override
    public void completar() {
        System.out.println("Se completo el video-curso " + this);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
