package practicaInterfaces.aprendizajeOnline;

public class CursoPDF implements  Curso {
    private String nombre;

    public CursoPDF(String nombre) {
        this.nombre = nombre.toLowerCase().replace(" ", "_")+".pdf";
    }

    @Override
    public void iniciar() {
        System.out.println("Se dio inicio al curso en base al PDF " + this);
    }

    @Override
    public void completar() {
        System.out.println("Se ha completado el curso de " + this);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
