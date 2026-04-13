public class Perro extends Animales{
    public Perro(String nombre){
        super(nombre);
    }

    @Override
    public void sonido(){
        System.out.println("El perro: " + nombre +" Hace: guau guau");
    }

}