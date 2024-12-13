public class EmpleadoFijo extends Empleado {
    private double bonoAnual;

    public EmpleadoFijo(String nombre, String genero, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual) {
        super(nombre,genero, salarioBase, horasTrabajadas, departamento);
        this.bonoAnual = bonoAnual;    
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
}
