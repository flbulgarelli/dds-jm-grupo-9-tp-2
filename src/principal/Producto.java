package principal;

public abstract class Producto {

	private boolean esImportado;
	private Marca marca;
	private double base;

	protected abstract double precioBase();

	// METODOS
	public double calculoSuma() {
		return (Empresa.getValorXdelNegocio() + this.precioBase());
	}

	public double precioFinal() {
		//FIXME eviten poner variables locales intermedias que no
		//no aportan nada. 
		Marca marcaProducto = this.getMarca();
		double precioIntermedio = this.precioIntermedio();

		return (precioIntermedio * marcaProducto
				.coeficienteMarcaCon(precioIntermedio));

	}

	public double precioIntermedio() {
		return this.calculoSuma() * this.tasaImportacion();
	}

	public double tasaImportacion() {
		if (this.getEsImportado()) {
			return (1 + Empresa.getTasaImportacion());
		} else {
			return 1;
		}
	}

	// Getters y Setters
	public boolean getEsImportado() {
		return esImportado;
	}

	public void setEsImportado(boolean esImportado) {
		this.esImportado = esImportado;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

}
