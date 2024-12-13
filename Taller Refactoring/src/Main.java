public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        EmpleadoPorHoras emp1 = new EmpleadoPorHoras("Dario Laborde", "Masculino",45, "Sistemas",15 );
        EmpleadoFijo emp2 = new EmpleadoFijo("Jorge Gaibor", "Masculino",700,45,"Contabilidad",40);
        EmpleadoTemporario emp3 = new EmpleadoTemporario("Jordan Salinas", "Masculino",200,20,"Medico",6);

        empresa.contratarEmpleado(emp1);
        empresa.contratarEmpleado(emp2);
        empresa.contratarEmpleado(emp3);

        emp1.imprimirDetalles();
        emp2.imprimirDetalles();
        emp3.imprimirDetalles();
    }
}