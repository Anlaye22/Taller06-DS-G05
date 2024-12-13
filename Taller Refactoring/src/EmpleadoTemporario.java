public class EmpleadoTemporario extends Empleado {

    private int mesesContrato;

    public EmpleadoTemporario(String nombre, String genero, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato) {
        super(nombre,genero,salarioBase,horasTrabajadas,departamento);
        this.mesesContrato = mesesContrato;
        
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
}
