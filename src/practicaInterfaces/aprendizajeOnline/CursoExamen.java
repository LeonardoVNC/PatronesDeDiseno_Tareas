package practicaInterfaces.aprendizajeOnline;

public class CursoExamen implements Curso, Evaluable {
    private String nombre;
    private int notaMinima;
    private boolean aprobado = false;

    public CursoExamen(String nombre, int notaMinima) {
        this.nombre = nombre +  "|Examen Final";
        this.notaMinima = notaMinima;
    }
    @Override
    public void iniciar() {
        System.out.println("Silencio todos, ha comenzado " + this);
    }

    @Override
    public void completar() {
        if(aprobado) {
            System.out.println("Felicitaciones, has aprobado " + this);
        } else {
            System.out.println("No cumpliste con las expectativas, más suerte la próxima");
        }
    }

    @Override
    public void calificar(int puntaje) {
        aprobado = puntaje>=notaMinima;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
