package practicaInterfaces.redSocial;

public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Jose Juan");
        Foto michi = new Foto("Michi");
        Video elect = new Video("Tutorial de electrónica");
        Articulo art = new Articulo("Informe");
        u.comentar(michi, "Michi michi michi michi pspspsps");
        u.compartir(michi);
        u.reaccionar(michi, "Me gusta");
        u.comentar(elect, "Muy interesante");
        u.compartir(art);
    }
}
