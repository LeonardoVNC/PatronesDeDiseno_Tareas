package practicaInterfaces.redSocial;

import java.util.LinkedList;

public class Video implements Interactuable {
    private String descripcion;
    private LinkedList<String> reacciones = new LinkedList<>();
    private LinkedList<String> comentarios = new LinkedList<>();
    private int compartidos = 0;

    public Video (String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public void comentar(String comentario) {
        comentarios.add(comentario);
        System.out.println(show() + " agregó el comentario: " + comentario);
    }

    @Override
    public void reaccionar(String tipoReaccion) {
        reacciones.add(tipoReaccion);
        System.out.println(show() + " agregó la reacción: " + tipoReaccion);
    }

    @Override
    public void compartir() {
        System.out.println(show() + " ha sido compartida " + ++compartidos + " veces");
    }

    public String show() {
        return "El video: \"" + descripcion + "\"";
    }
}
