package practicaInterfaces.gestionEmpleados;

import java.util.LinkedList;
import java.util.List;

public class Gerente implements Empleado, Bonificable {
    private int salario;
    private String cargo;
    private List<Empleado> empleados = new LinkedList<>();

    public Gerente(int salario, String cargo) {
        this.salario = salario;
        this.cargo = cargo;
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
        System.out.println("Se ha agregado a " + e + " a los empleados guiados por " + this);
    }
    @Override
    public int calcularSalario() {
        int salarioReal = salario + calcularBono();
        System.out.println(this + " recibe " + salarioReal + " como salario");
        return  salarioReal;
    }

    @Override
    public String obtenerCargo() {
        return cargo;
    }

    @Override
    public int calcularBono() {
        int bono = empleados.size()*100;
        System.out.println(this + " recibe un generoso bono de " + bono + " gracias a sus empleados");
        return bono;
    }
    @Override
    public String toString() {
        return "El gerente de " + cargo;
    }
}
