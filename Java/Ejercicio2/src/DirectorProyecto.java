/**
 * Representa al director de proyecto.
 * Hereda de Investigador y suma un bono segun presupuesto asignado.
 */
public class DirectorProyecto extends Investigador {
    private double presupuestoAsignado;

    public DirectorProyecto(String rut, String nombre, double salarioBase, int publicacionesIndexadas, double presupuestoAsignado){
        super(rut, nombre, salarioBase, publicacionesIndexadas);
        this.presupuestoAsignado = presupuestoAsignado;
    }

    /**
     * Calcula la remuneracion del director.
     * Formula: remuneracion de investigador + (presupuesto * 0.02).
     */
    @Override
    public double calcularRemuneracionMensual(){
        return super.calcularRemuneracionMensual() + (presupuestoAsignado *0.02);
    }

    /**
     * Imprime el reporte del director en consola.
     */
    @Override
    public void generarReporte(){
        System.out.println("Académico: " + getNombre() + " | RUT: " + getRut());
        System.out.println("Remuneración total: $" + calcularRemuneracionMensual());
        System.out.println("");
    }
}
