public class EmpleadoPorHoras extends Empleado {
    private double tarifahora;

    public EmpleadoPorHoras(String nombre, String genero, int horasTrabajadas, String departamento, double tarifaHora) {
        super(nombre, genero,0,horasTrabajadas, departamento);
        this.tarifahora = tarifaHora;
        super.setSalarioBase(calcularSalario());

    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
    }

    @Override
    public double calcularSalario() {
        return  super.getHorasTrabajadas() * tarifahora;

    }

    // Más metodos
}