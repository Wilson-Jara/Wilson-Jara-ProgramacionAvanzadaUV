public abstract class Sensores{
    private String idActivo;
    private String ubicacion;
    private double valorActual;

    public Sensores(String idActivo, String ubicacion, double valorActual){
        this.idActivo = idActivo;
        this.ubicacion = ubicacion;
        this.valorActual = valorActual;
    }
    public String getIdActivo() {
        return idActivo;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    public double getValorActual(){
        return valorActual;
    }
    protected void setValorActual(double valorActual){
        this.valorActual = valorActual;
    }
    public abstract void actualizarLectura(double nuevoValor);
    public abstract boolean requiereMantenimiento();
    

}

