/**
 * Clase base abstracta para cualquier miembro del proyecto.
 * Contiene los datos comunes y define los metodos que cada rol debe implementar.
 */
public abstract class MiembroProyecto {
    private String rut;
    private String nombre;
    private double salarioBase;

    public MiembroProyecto(String rut, String nombre, double salarioBase){
        this.rut         = rut;
        this.nombre      = nombre;
        this.salarioBase = salarioBase;
    }

    /**
     * Devuelve el identificador RUT del miembro.
     */
    public String getRut(){
        return rut;
    }

    /**
     * Devuelve el nombre completo del miembro.
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Devuelve el salario base mensual.
     */
    public double getSalariobase(){
        return salarioBase;
    }

    /**
     * Calcula la remuneracion mensual segun el tipo de miembro.
     */
    public abstract double calcularRemuneracionMensual();
    /**
     * Muestra en consola el reporte de liquidacion del miembro.
     */
    public abstract void generarReporte();
    
}
