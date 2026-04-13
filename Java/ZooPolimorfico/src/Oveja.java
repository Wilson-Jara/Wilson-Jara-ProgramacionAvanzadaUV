public class Oveja extends Animales {
	public Oveja(String nombre) {
		super(nombre);
	}

	@Override
	public void sonido() {
		System.out.println("La oveja: " + nombre + " Hace: beee beee");
	}
}
