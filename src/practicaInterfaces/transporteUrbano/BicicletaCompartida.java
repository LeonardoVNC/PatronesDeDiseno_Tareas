package practicaInterfaces.transporteUrbano;

public class BicicletaCompartida implements TransportePublico {
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Una bicicleta misteriosa te recoge en " + origen + " y te deja en " + destino);
    }

    @Override
    public void calcularTarifa() {
        System.out.println("El día estaba soleado, con un Pilfrut será suficiente para pagar");
    }

    @Override
    public String toString(){
        return "Una bicicleta";
    }
}
