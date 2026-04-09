/**
 * Representa a la persona encargada del aseo.
 * Su remuneracion incluye un bono de limpieza.
 */
public class tiaDelAseo extends MiembroProyecto {
    private double bonoLimpieza;
    public tiaDelAseo(String rut, String nombre, double salarioBase, double bonoLimpieza){
        super(rut, nombre, salarioBase);
        this.bonoLimpieza = bonoLimpieza;
    }
    /**
     * Calcula la remuneracion mensual del personal de aseo.
     * Formula: salario base + (bono limpieza * 30000).
     */
    @Override
    public double calcularRemuneracionMensual(){
        double bonoTia = bonoLimpieza * 30000;
        return getSalariobase() + bonoTia;
    }
    /**
     * Imprime el reporte del personal de aseo en consola.
     */
    @Override
    public void generarReporte() {
        System.out.println("Académico: " + getNombre() + " | RUT: " + getRut());
        System.out.println("Remuneración total: $" + calcularRemuneracionMensual());
        System.out.println("");
    }
}
