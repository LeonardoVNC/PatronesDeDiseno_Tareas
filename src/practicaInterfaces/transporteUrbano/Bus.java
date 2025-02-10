package practicaInterfaces.transporteUrbano;

public class Bus implements TransportePublico {
    private String matricula;

    public Bus (String matricula) {
        this.matricula = matricula;
    }
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println(this + " te recoge de " + origen + " y te deja en la esquina de " + destino);
    }

    @Override
    public void calcularTarifa() {
        System.out.println(this + " te cobra 2Bs");
    }

    @Override
    public String toString(){
        return "El bus de matrícula " + matricula;
    }
}
