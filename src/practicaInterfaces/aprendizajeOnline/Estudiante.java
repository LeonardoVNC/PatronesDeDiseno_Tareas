package practicaInterfaces.aprendizajeOnline;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Estudiante {
    private String nombre;
    private Set<Curso> cursos = new HashSet<>();

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void inscribirseCurso(Curso curso) {
        if (cursos.contains(curso)) {
            System.out.println(this + " ya se ha inscrito a este curso.");
        } else {
            cursos.add(curso);
            System.out.println(this + " se ha inscrito a " + curso);
            empezarCurso(curso);
        }
    }

    private void empezarCurso(Curso curso) {
        curso.iniciar();
        System.out.println(this + " ha iniciado " + curso);
    }

    public void completarCurso(Curso curso) {
        if (cursos.contains(curso)) {
            System.out.println(this + " trata de completar el curso");
            curso.completar();
        } else {
            System.out.println(this + " aun no se ha inscrito a " + curso);
        }
    }

    @Override
    public String toString() {
        return "El estudiante " + nombre;
    }
}
