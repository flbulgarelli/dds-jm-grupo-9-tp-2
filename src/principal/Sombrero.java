package principal;

public class Sombrero extends Producto {

	private double metrosexualidad;

	// METODOS DE CLASE
	public static Sombrero nuevoSombrero(double unBase, Marca unaMarca,
			boolean esImportado, double unaMetrosexualidad) {
		Sombrero test = new Sombrero();
		test.setBase(unBase);
		test.setMarca(unaMarca);
		test.setEsImportado(esImportado);
		test.setMetrosexualidad(unaMetrosexualidad);
		return test;
	}

	// METODOS
	public double precioBase() {
		return (this.getBase() + this.getMetrosexualidad());
	}

	// Getters y Setters
	public double getMetrosexualidad() {
		return metrosexualidad;
	}

	public void setMetrosexualidad(double metrosexualidad) {
		this.metrosexualidad = metrosexualidad;
	}

}
