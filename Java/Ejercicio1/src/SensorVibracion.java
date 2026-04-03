public class SensorVibracion extends Sensores {
    private double frecuenciaBase;

    public SensorVibracion(String idActivo, String ubicacion, double valorActual, double frecuenciaBase){
        super(idActivo, ubicacion, valorActual);
        this.frecuenciaBase = frecuenciaBase;
    }

    @Override
    public void actualizarLectura(double nuevoValor){
        setValorActual(nuevoValor);
        System.out.println("Lectura actualizada en " + getUbicacion() + ": " + getValorActual() + " Hz");
    }
    @Override
    public boolean requiereMantenimiento() {
        double diferencia = Math.abs(getValorActual()- frecuenciaBase);
        return diferencia > (frecuenciaBase* 0.15);
    }

}   