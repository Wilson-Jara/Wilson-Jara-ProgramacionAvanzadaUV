import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Carrito miCarrito = new Carrito();
        GeneradorTicket generador = new GeneradorTicket();

        System.out.println("----- Caja Registradora Iniciada -----");

        while (true) {
            System.out.println("Ingrse producto o (imprimir para finalizar): ");
            String comando = teclado.nextLine();
            if(comando.equalsIgnoreCase("imprimir")){
                break;
            }
            System.out.println("precio de producto: ");
            int valor = Integer.parseInt(teclado.nextLine());

            Producto nuevoItem = new Producto(comando, valor);
            miCarrito.agregadorProductos(nuevoItem);

        }
        System.out.println("[SISTEMA] Venta Finalizada.");
        System.out.println("[SISTEMA] Generando archivo de respaldo. ");

        generador.crearArchivoTXT(miCarrito);
        teclado.close();
    }
}
