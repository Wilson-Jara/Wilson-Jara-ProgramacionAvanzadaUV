public class SensorPresion {
    
    // Atributos
    private String idActivo;
    private String ubicacion;
    private double valorActual;
    private double presionCritica;
    
    // Constructor
    public SensorPresion(String idActivo, String ubicacion, double valorActual, double presionCritica) {
        this.idActivo = idActivo;
        this.ubicacion = ubicacion;
        this.valorActual = valorActual;
        this.presionCritica = presionCritica;
    }
    
    // Getters
    public String getIdActivo() {
        return idActivo;
    }
    
    public double getValorActual() {
        return valorActual;
    }
    
    // Métodos
    public void actualizarLectura(double nuevoValor) {
        this.valorActual = nuevoValor;
        System.out.println("Lectura actualizada en " + ubicacion + ": " + this.valorActual + " PSI");
    }
    
    public boolean requiereMantenimiento() {
        return valorActual > presionCritica || valorActual <= 0;
    }
}