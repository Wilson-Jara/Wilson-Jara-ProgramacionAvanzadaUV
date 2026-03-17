package Clase16_3_26;
class Auto {
    String marca;
    String modelo;
    String color;
        public void EncerderAuto(){
            System.out.println("El auto " + marca + " Modelo " + modelo + " De color " + color);
        }
}
public class Clase2 {
    public static void main (String[]args){
        Auto miPrimerAuto = new Auto();
        Auto AutoEmpresa = new Auto();
        miPrimerAuto.marca= "Toyota";
        miPrimerAuto.modelo= "Corola";
        miPrimerAuto.color= "rojo";

        miPrimerAuto.EncerderAuto();
    }

}