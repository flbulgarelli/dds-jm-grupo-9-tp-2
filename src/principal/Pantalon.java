package principal;

public class Pantalon extends Producto {

	private double cantidadDeTela;

	// METODOS DE CLASE
	public static Pantalon nuevoPantalon(double unBase, Marca unaMarca,
			boolean esImportado, double unaCantidadDeTela) {
		Pantalon test = new Pantalon();
		test.setBase(unBase);
		test.setMarca(unaMarca);
		test.setEsImportado(esImportado);
		test.setCantidadDeTela(unaCantidadDeTela);
		return test;
	}

	// METODOS
	public double precioBase() {
		return (this.getBase() + this.getCantidadDeTela());
	}

	// Getters y Setters
	public double getCantidadDeTela() {
		return cantidadDeTela;
	}

	public void setCantidadDeTela(double cantidadDeTela) {
		this.cantidadDeTela = cantidadDeTela;
	}

}
