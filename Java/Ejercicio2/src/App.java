/**
 * Punto de entrada de la aplicacion.
 * Crea distintos miembros del proyecto y genera su liquidacion mensual.
 */
public class App {
    /**
     * Ejecuta el flujo principal de prueba del sistema.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("---SISTEMA DE GESTION DE PROYECTOS---");
        System.out.println("Generando liquidaciones del mes");
        System.out.println("");
        MiembroProyecto[] empleadoo = new MiembroProyecto[4];
        empleadoo[0] = new Investigador("15.234.567-8", "Andrea Gomez", 552000, 4);
        empleadoo[0].calcularRemuneracionMensual();
        empleadoo[0].generarReporte();
        
        empleadoo[1] = new FuncionarioAdministrativo("12.345.678-9", "Roberto Silva", 1180000, 20);
        empleadoo[1].calcularRemuneracionMensual();
        empleadoo[1].generarReporte();
        
        empleadoo[2] = new DirectorProyecto("10.987.645-3", "Carmen lopez", 2000000, 2, 25000000);
        empleadoo[2].calcularRemuneracionMensual();
        empleadoo[2].generarReporte();

        empleadoo[3] = new tiaDelAseo("10.555.044-1", "Carlos Vera", 500000, 5);
        empleadoo[3].calcularRemuneracionMensual();
        empleadoo[3].generarReporte();
        };
    }
