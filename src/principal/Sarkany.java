package principal;

public class Sarkany extends Marca {

	public double coeficienteMarcaCon (double unPrecio) {
		
		if ( unPrecio > 500 ){
			return ( 1.35 );
		} else {
			return ( 1.10 );
		}
		
	}
	
}
