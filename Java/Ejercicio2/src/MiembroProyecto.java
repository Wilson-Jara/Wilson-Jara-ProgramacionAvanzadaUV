public abstract class MiembroProyecto {
    private String rut;
    private String nombre;
    private double salarioBase;

    public MiembroProyecto(String rut, String nombre, double salarioBase){
        this.rut         = rut;
        this.nombre      = nombre;
        this.salarioBase = salarioBase;
    }

    public String getRut(){
        return rut;
    }

    public String getNombre(){
        return nombre;
    }
    
    public double getSalariobase(){
        return salarioBase;
    }


    public abstract double calcularRemuneracionMensual();
    public abstract void generarReporte();
    
}
