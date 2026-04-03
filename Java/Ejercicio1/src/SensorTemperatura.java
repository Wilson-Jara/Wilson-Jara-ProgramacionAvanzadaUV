public class SensorTemperatura {
    
    // Atributos
    private String idActivo;
    private String ubicacion;
    private double valorActual;
    private double temperaturaUmbral;
    
    // Constructor
    public SensorTemperatura(String idActivo, String ubicacion, double valorActual, double temperaturaUmbral) {
        this.idActivo = idActivo;
        this.ubicacion = ubicacion;
        this.valorActual = valorActual;
        this.temperaturaUmbral = temperaturaUmbral;
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
        System.out.println("Lectura actualizada en " + ubicacion + ": " + this.valorActual + " °C");
    }
    
    public boolean requiereMantenimiento() {
        return valorActual > temperaturaUmbral;
    }
}