package principal;

import java.util.*;
import principal.Venta;

public class Empresa {
	//FIXME Cuando tipen las colecciones, siempre pongan el parámetro de tipo
	//Se acuerdan que en Hakell tipabamos a las listas no simplemente como lista 
	//sino como lista de algo? ([a])
	//Bueno, acá es lo mismo. Una lista de ventas se tipa como List<Venta>
	private List ventas = new LinkedList();
	public static double valorXdelNegocio = 0;
	public static double tasaImportacion = 0;

	// METODOS CLASE
	public static void setTasaImportacion(double unValor) {
		Empresa.tasaImportacion = unValor / 100;
	}

	// METODOS
	public Empresa() {
		this.setVentas(new LinkedList());
	}

	//FIXME cuando hagamos tests la necesidad de tener un workspace
	//en un main se elimina, pero mientras tanto, si van a hacerlo
	//ponganlo siempre en un archivo disinto, en una clase, por ejemplo, Main
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Empresa.setValorXdelNegocio(150);
		Empresa.setTasaImportacion(30);

		Date unDia = new Date();

		// Marcas
		Armani armani = new Armani();
		Sarkany sarkany = new Sarkany();

		// Productos
		Camisa camisa = Camisa.nuevaCamisa(200, armani, false);
		Saco saco = Saco.nuevoSaco(300, armani, false, 1);
		Pantalon pantalon = Pantalon.nuevoPantalon(250, sarkany, false, 46);
		Zapato zapato = Zapato.nuevoZapato(400, sarkany, false, 10);
		Sombrero sombrero = Sombrero.nuevoSombrero(150, armani, false, 5);

		// TEST
		empresa.nuevaVentaDelProducto(camisa, unDia, 2);
		empresa.nuevaVentaDelProducto(saco, unDia, 2);
		empresa.nuevaVentaDelProducto(pantalon, unDia, 2);
		empresa.nuevaVentaDelProducto(zapato, unDia, 2);
		empresa.nuevaVentaDelProducto(sombrero, unDia, 2);

		System.out
				.println("El precio de la camisa es: " + camisa.precioFinal());
		System.out.println("El precio del saco es: " + saco.precioFinal());
		System.out.println("El precio del pantalon es: "
				+ pantalon.precioFinal());
		System.out.println("El precio del zapato es: " + zapato.precioFinal());
		System.out.println("El precio del sombrero es: "
				+ sombrero.precioFinal());
		System.out.println("\nLa ganacia de hoy es de: "
				+ empresa.ganciasDelDia(unDia));

	}

	//FIXME no se compliquen!
	//Usen lo mensajes de colecciones anáogos a los de Smalltalk
	//Esto que están aca es una simple sumatoria, así que se puede escribir como
	// ventasDelDia(unDia).stream().mapToDouble(Venta::valor).sum();
	//más simple no?
	public double ganciasDelDia(Date unDia) {
		
		List ventasDia = this.ventasDelDia(unDia);
		double ganancias = 0;

		Iterator iterador = ventasDia.iterator();

		while (iterador.hasNext()) {
			Venta unaVenta = (Venta) iterador.next();
			ganancias = ganancias + unaVenta.valor();
		}

		return ganancias;
	}

	public void nuevaVentaDeHoyDelProducto(Producto unProducto, int unaCantidad) {
		this.nuevaVentaDelProducto(unProducto, new Date(), unaCantidad);
	}

	public void nuevaVentaDelProducto(Producto unProducto, Date unDia,
			int unaCantidad) {
		getVentas().add(new Venta(unProducto, unDia, unaCantidad));
	}

	//FIXME idem anterior. Tipen al retorno como List<Venta>, y no List.
	//Acá yo y alo hice por ustedes en el retorno. 
	//FIXME acá también pueden usar el mensaje de colecciones filter, que devuelve un Stream, no un List
	public List<Venta> ventasDelDia(Date unDia) {
		List ventasDia = new LinkedList();
		List ventas = getVentas();
		Iterator iterador = ventas.iterator();

		while (iterador.hasNext()) {
			Venta elemento = (Venta) iterador.next();
			if (elemento.getFecha() == unDia) {
				ventasDia.add(elemento);
			}
		}
		return ventasDia;
	}

	// Getters y Setters
	public static void setValorXdelNegocio(double unValor) {
		Empresa.valorXdelNegocio = unValor;
	}

	public static double getValorXdelNegocio() {
		return Empresa.valorXdelNegocio;
	}

	public static double getTasaImportacion() {
		return Empresa.tasaImportacion;
	}

	public List getVentas() {
		return ventas;
	}

	public void setVentas(List ventas) {
		this.ventas = ventas;
	}

}
