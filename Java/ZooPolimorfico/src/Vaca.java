public class Vaca extends Animales {
	public Vaca(String nombre) {
		super(nombre);
	}

	@Override
	public void sonido() {
		System.out.println("La vaca: " + nombre + " Hace: muu muu");
	}
}
