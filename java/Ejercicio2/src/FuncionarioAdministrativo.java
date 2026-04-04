public class FuncionarioAdministrativo extends MiembroProyecto{
    private int horasExtras;

    public FuncionarioAdministrativo(String rut, String nombre, double salarioBase, int horasExtras) {
        super(rut,nombre,salarioBase);
        this.horasExtras = horasExtras;
    }

    public double calcularRemuneracionMensual() {
        double pagoHorasExtras = horasExtras * 8500;
        return getSalariobase() + pagoHorasExtras;
    }
    
    public void generarReporte() {
        System.out.println("Funcionario: " + getNombre() + " | RUT: " + getRut());
        System.out.println("Remuneración total: $" + calcularRemuneracionMensual());
    }
}

