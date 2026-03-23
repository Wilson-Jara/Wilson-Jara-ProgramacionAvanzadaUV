import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> listaProductos;
    private int totalAcumulado;

    public Carrito(){
        this.listaProductos = new ArrayList<>();
        this.totalAcumulado = 0;

    
    }
    public void agregadorProductos(Producto p){
        listaProductos.add(p);
        totalAcumulado += p.getPrecio();
    }

    public List<Producto> getLista(){
        return listaProductos;
    }

    public int getTotal(){
        return totalAcumulado;
    }
}
