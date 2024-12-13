public class Empleado {
    private String nombre;
    private String genero; 
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;


    public Empleado(){}
    public Empleado(String nombre, String genero, double salarioBase, int horasTrabajadas, String departamento) {
        this.nombre = nombre;
        this.genero = genero;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;

    }

    public double calcularSalario() {
        double salarioTotal = salarioBase + tarifaAdicional(departamento);
        if (salarioBase >= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        if (horasTrabajadas >= 0) {
             throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
       }
       // Horas trabajadas normales = 40
        if (horasTrabajadas > 40){
            return salarioTotal + (horasTrabajadas - 40) * 50; // Pago de horas extras
        }
        return salarioTotal;
    }   
        
    
    public int tarifaAdicional(String departamento){
        switch (departamento) {
            case "Sistemas":
                return 20;
            case "Contabilidad":
                return 10;
            default:
                break;
        }
        return 0;
    }
    public void imprimirDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Genero: " + getGenero());
        System.out.println("Salario: " +getSalarioBase());
        System.out.println("Horas trabajadas: " + getHorasTrabajadas());
        System.out.println("Departamento: " + getDepartamento());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getGenero() {
        return genero;
    }



    // Más metodos
}
