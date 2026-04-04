public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---SISTEMA DE GESTION DE PROYECTOS---");
        System.out.println("Generando liquidaciones del mes");

        MiembroProyecto[] empleadoo = new MiembroProyecto[3];
        empleadoo[0] = new Investigador("15.234.567-8", "Andrea Gomez", 552000, 4);
        empleadoo[0].calcularRemuneracionMensual();
        empleadoo[0].generarReporte();
        
        empleadoo[1] = new FuncionarioAdministrativo("12.345.678-9", "Roberto Silva", 1180000, 20);
        empleadoo[1].calcularRemuneracionMensual();
        empleadoo[1].generarReporte();
        
        empleadoo[2] = new DirectorProyecto("10.987.645-3", "Carmen lopez", 2000000, 2, 25000000);
        empleadoo[2].calcularRemuneracionMensual();
        empleadoo[2].generarReporte();

        };

    }
