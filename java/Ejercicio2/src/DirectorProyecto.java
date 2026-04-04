public class DirectorProyecto extends Investigador {
    private double presupuestoAsignado;

    public DirectorProyecto(String rut, String nombre, double salarioBase, int publicacionesIndexadas, double presupuestoAsignado){
        super(rut, nombre, salarioBase, publicacionesIndexadas);
        this.presupuestoAsignado = presupuestoAsignado;
    }

    @Override
    public double calcularRemuneracionMensual(){
        return super.calcularRemuneracionMensual() + (presupuestoAsignado *0.02);
    }


}
