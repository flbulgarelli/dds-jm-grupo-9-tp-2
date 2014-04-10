package principal;

public class Saco extends Producto {

	private double cantidadDeBotones;
	
// METODOS DE CLASE
	
	public static Saco nuevoSaco(double unBase, Marca unaMarca, boolean esImportado, double unosBotones){
		Saco test = new Saco(); 
		test.setBase( unBase );
		test.setMarca( unaMarca );
		test.setEsImportado( esImportado );
		test.setCantidadDeBotones( unosBotones );
		return test;
	}
	
	
// METODOS
	public double precioBase(){
		return ( this.getBase() + ( 10 * this.getCantidadDeBotones() ) );
	}

// Getters y Setters
	public double getCantidadDeBotones() {
		return cantidadDeBotones;
	}
	public void setCantidadDeBotones(double cantidadDeBotones) {
		this.cantidadDeBotones = cantidadDeBotones;
	}

	

}
