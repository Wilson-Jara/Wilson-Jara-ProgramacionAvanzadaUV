public class SensorTemperatura extends Sensores{
    
    // Atributos
    private double temperaturaUmbral;
    
    // Constructor
    public SensorTemperatura(String idActivo, String ubicacion, double valorActual,double temperaturaUmbral1) {
        super(idActivo, ubicacion, valorActual);
        this.temperaturaUmbral = temperaturaUmbral1;
    }
    
    // Métodos
    @Override
    public void actualizarLectura(double nuevoValor) {
        setValorActual(nuevoValor);
        System.out.println("Lectura actualizada en " + getUbicacion() + ": " + getValorActual() + " °C");
    }
    @Override
    public boolean requiereMantenimiento() {
        return getValorActual() > temperaturaUmbral;
    }
}