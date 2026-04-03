public class App {
    public static void main(String[] args){
        System.out.println("------Iniciando sistema de telemetria-------");
        System.out.println("[Datos Actuales]");
        Sensores[] sensor = new Sensores[3];
        sensor[0] = new SensorTemperatura("senTemp-01", "horno Principal", 85.5, 90);
        sensor[1] = new SensorPresion("Pres-04", "Valvula de escape", 70, 140);
        sensor[2] = new SensorPresion("Vib-02", "Turbina Central", 40, 50);
        System.out.println(sensor[0].getIdActivo() + " " + sensor[0].getUbicacion() + " " + sensor[0].getValorActual());
        System.out.println(sensor[1].getIdActivo() + " " + sensor[1].getUbicacion() + " " + sensor[1].getValorActual());
        System.out.println(sensor[2].getIdActivo() + " " + sensor[2].getUbicacion() + " " + sensor[2].getValorActual());
        
        System.out.println(" ");
        System.out.println("[Actualizando Lecturas]");
        sensor[0].actualizarLectura(92.3);
        sensor[1].actualizarLectura(120.5);
        sensor[2].actualizarLectura(58.5);






        System.out.println(" ");
        System.out.println("[Reporte de mantenimiento Predictivo]");
        for (Sensores sensores : sensor){
            System.out.print("sensor " + sensores.getIdActivo() + " "+ sensores.getUbicacion() + " ");
            if (sensores.requiereMantenimiento()){
                System.out.println("¡ALERTA! Requiere revisión técnica.");
            } else {
                System.out.println("Operando en parámetros normales.");
            }
        }

        
    }
}
