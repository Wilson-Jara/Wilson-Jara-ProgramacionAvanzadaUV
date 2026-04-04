public class Investigador extends MiembroProyecto {
    private int publicacionesIndexadas;

    public Investigador(String rut, String nombre, double salarioBase, int publicacionesIndexadas) {
        super(rut,nombre,salarioBase);
        this.publicacionesIndexadas = publicacionesIndexadas;
    }

    
    public double calcularRemuneracionMensual() {
        double bonoInvestigacion = publicacionesIndexadas * 50000;
        return getSalariobase() + bonoInvestigacion;
    }

    public void generarReporte() {
        System.out.println("Académico: " + getNombre() + " | RUT: " + getRut());
        System.out.println("Remuneración total: $" + calcularRemuneracionMensual());
    }
}
