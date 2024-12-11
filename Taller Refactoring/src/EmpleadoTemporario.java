public class EmpleadoTemporario extends Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre,genero,salarioBase,horasTrabajadas,departamento, genero);
        this.mesesContrato = mesesContrato;
        
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + super.getGenero());
        System.out.println("Salario: " + salarioBase);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento);
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
}
