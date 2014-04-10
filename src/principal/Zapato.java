package principal;

public class Zapato extends Producto {

	private double talle;

	// METODOS DE CLASE
	public static Zapato nuevoZapato(double unBase, Marca unaMarca,
			boolean esImportado, double UnTalle) {
		Zapato test = new Zapato();
		test.setBase(unBase);
		test.setMarca(unaMarca);
		test.setEsImportado(esImportado);
		test.setTalle(UnTalle);
		return test;
	}

	// METODOS
	public double precioBase() {
		return (this.getBase() + (5 * this.getTalle()));
	}

	// Getters y Setters
	public double getTalle() {
		return talle;
	}

	public void setTalle(double talle) {
		this.talle = talle;
	}

}
