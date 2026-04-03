public class SensorPresion extends Sensores {
    
    // Atributos
    private double presionCritica;
    
    // Constructor
    public SensorPresion(String idActivo, String ubicacion, double valorActual, double presionCritica) {
        super(idActivo,ubicacion,valorActual);
        this.presionCritica = presionCritica;
    }
    
    // Métodos
    public void actualizarLectura(double nuevoValor) {
        setValorActual(nuevoValor);
        System.out.println("Lectura actualizada en " + getUbicacion() + ": " + getValorActual() + " PSI");
    }
    
    public boolean requiereMantenimiento() {
        return getValorActual() > presionCritica || getValorActual() <= 0;
    }
}