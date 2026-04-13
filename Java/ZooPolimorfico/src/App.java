public class App {
    public static void main(String[] args) throws Exception {
        Animales[] animal = new Animales[3]; 

        animal[0] = new Perro("firulais");
        animal[1] = new Vaca("Ana");
        animal[2] = new Oveja("lanuda");

        for (Animales a : animal){
            a.sonido();
        }
    }    
}
