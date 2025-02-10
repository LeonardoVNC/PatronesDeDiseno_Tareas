package practicaInterfaces.gestionEmpleados;

public class Main {
    public static void main(String[] args) {
        Empresa emp = new Empresa(new Gerente(9990, "relaciones públicas"));
        Tecnico tecE = new Tecnico(6700, "electrónicos");
        Administrativo adm = new Administrativo(4800, "empresas");
        Administrativo rrhh = new Administrativo(5900, "RRHH");
        Tecnico tecM = new Tecnico(8700, "maquinaria pesada");
        emp.contratarEmpleado(tecE);
        emp.contratarEmpleado(adm);
        emp.contratarEmpleado(rrhh);
        emp.contratarEmpleado(tecM);

        emp.asignarEmpleados();
        emp.verificarSalario();
    }
}
