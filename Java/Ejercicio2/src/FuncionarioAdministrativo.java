/**
 * Representa a un funcionario administrativo.
 * Su remuneracion incluye el pago de horas extras.
 */
public class FuncionarioAdministrativo extends MiembroProyecto{
    private int horasExtras;

    public FuncionarioAdministrativo(String rut, String nombre, double salarioBase, int horasExtras) {
        super(rut,nombre,salarioBase);
        this.horasExtras = horasExtras;
    }

    /**
     * Calcula la remuneracion mensual del funcionario.
     * Formula: salario base + (horas extra * 8500).
     */
    public double calcularRemuneracionMensual() {
        double pagoHorasExtras = horasExtras * 8500;
        return getSalariobase() + pagoHorasExtras;
    }
    
    /**
     * Imprime el reporte del funcionario en consola.
     */
    @Override
    public void generarReporte() {
        System.out.println("Funcionario: " + getNombre() + " | RUT: " + getRut());
        System.out.println("Remuneración total: $" + calcularRemuneracionMensual());
        System.out.println("");
    }
}

