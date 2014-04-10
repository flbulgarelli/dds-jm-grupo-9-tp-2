package principal;

public class Camisa extends Producto {

	
// METODOS DE CLASE
	
	public static Camisa nuevaCamisa(double unBase, Marca unaMarca, boolean esImportado){
		Camisa test = new Camisa(); 
		test.setBase( unBase );
		test.setMarca( unaMarca );
		test.setEsImportado( esImportado );
		return test;
	}
	
	
	
	public double precioBase(){
		return this.getBase();
	}
	
}
