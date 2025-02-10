package practicaInterfaces.gestionEmpleados;

import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private Gerente gerente;
    private List<Empleado> empleados = new LinkedList<>();

    public Empresa (Gerente gerente){
        this.gerente = gerente;
    }

    public void contratarEmpleado(Empleado e){
        empleados.add(e);
    }

    public void asignarEmpleados() {
        for (int i=0; i<empleados.size(); i++) {
            gerente.agregarEmpleado(empleados.get(i));
        }
    }

    public void verificarSalario() {
        for (int i=0; i < empleados.size(); i++) {
            empleados.get(i).calcularSalario();
        }
    }
}
