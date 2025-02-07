package practicaInterfaces.aprendizajeOnline;

public class Main {
    public static void main(String[] args) {
        Estudiante jj = new Estudiante("Jose Juan");
        Estudiante pp = new Estudiante("Peter Parker");
        Estudiante mm = new Estudiante("Mickey Mouse");
        CursoExamen e = new CursoExamen("Física II", 61);
        CursoVideo v = new CursoVideo("Matemáticas para Ingeniería II");
        CursoPDF pdf = new CursoPDF("Algebra Lineal");

        jj.completarCurso(v);
        jj.inscribirseCurso(v);
        jj.inscribirseCurso(pdf);
        pp.inscribirseCurso(pdf);
        mm.completarCurso(e);
        mm.inscribirseCurso(e);
        jj.completarCurso(v);
        jj.completarCurso(pdf);
        e.calificar(71);
        mm.completarCurso(e);
    }
}
