/**
 * Representa a un investigador del proyecto.
 * Su remuneracion incluye un bono por publicaciones indexadas.
 */
public class Investigador extends MiembroProyecto {
    private int publicacionesIndexadas;

    public Investigador(String rut, String nombre, double salarioBase, int publicacionesIndexadas) {
        super(rut,nombre,salarioBase);
        this.publicacionesIndexadas = publicacionesIndexadas;
    }
    /**
     * Calcula la remuneracion mensual del investigador.
     * Formula: salario base + (publicaciones * 50000).
     */
    @Override
    public double calcularRemuneracionMensual() {
        double bonoInvestigacion = publicacionesIndexadas * 50000;
        return getSalariobase() + bonoInvestigacion;
    }
    /**
     * Imprime el reporte del investigador en consola.
     */
    @Override
    public void generarReporte() {
        System.out.println("Académico: " + getNombre() + " | RUT: " + getRut());
        System.out.println("Remuneración total: $" + calcularRemuneracionMensual());
        System.out.println("");
    }
}