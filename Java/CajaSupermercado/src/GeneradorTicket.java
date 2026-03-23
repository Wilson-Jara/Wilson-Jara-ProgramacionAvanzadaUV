import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class GeneradorTicket {

    public void crearArchivoTXT(Carrito CarritoVenta){

    try{
        FileWriter fw = new FileWriter("ticket.txt");
        PrintWriter pw = new PrintWriter(fw);

        pw.println("====================");
        pw.println("  Supermercado poo     ");
        pw.println("====================");

        for (Producto p : CarritoVenta.getLista()){
            pw.println("-" + p.getNombre() + ": $" +p.getPrecio());
            

        } 
        pw.println("--------------------");
            pw.println("   Total a Pagar: $" + CarritoVenta.getTotal());
            pw.println("====================");
            pw.close();
            System.out.println("Archivo generado");


    }catch (IOException e){
        System.out.println("Error I/O crítico" + e.getMessage());
    }
    }
}    

