package principal;

import java.util.*;

public class Venta {

	private Date fecha;
	private Producto producto;
	private int cantidad;

	// METODOS
	public Venta(Producto unProducto, Date unDia, int unaCantidad) {
		this.setCantidad(unaCantidad);
		this.setFecha(unDia);
		this.setProducto(unProducto);
	}

	/*
	 * public double costoReal (){ double precioProducto =
	 * this.getProducto().precioBase(); precioProducto = precioProducto *
	 * this.getCantidad();
	 * 
	 * return precioProducto; }
	 */
	public double valor() {
		double precioProducto = this.getProducto().precioFinal();
		precioProducto = precioProducto * this.getCantidad();

		return precioProducto;
	}

	// Getters y Setters
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
