package practicaInterfaces.gestionEmpleados;

public class Administrativo implements Empleado {
    private int salario;
    private String cargo;

    public Administrativo(int salario, String cargo) {
        this.salario = salario;
        this.cargo = cargo;
    }
    @Override
    public int calcularSalario() {
        int salarioReal = salario - 100;
        System.out.println("Este " + this + " debe recibir " + salario + " como pago, pero se le descontarán 100Bs para costos de seguro médico y bonos para gerentes. Recibirá " + salarioReal + "Bs");
        return salarioReal;
    }

    @Override
    public String obtenerCargo() {
        return cargo;
    }

    @Override
    public String toString(){
        return "administrador de " + cargo;
    }
}
