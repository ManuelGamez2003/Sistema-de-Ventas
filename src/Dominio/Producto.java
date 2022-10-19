/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.text.DecimalFormat;

/**
 *
 * @author Alumno Mañana
 */
public class Producto{
    private int idProducto; 
    private String nombre;
    private double precio;
    static int contadorProductos;

    public Producto(String nombre, double precio) {
        this();        
        this.idProducto = contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
    }
    public Producto(){
        contadorProductos++;
    }
    
    public int getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getContadorProductos() {
        return contadorProductos;
    }
    public void setContadorProductos(int contadorProductos) {
        this.contadorProductos = contadorProductos;
    }
    
	@Override      
	public String toString() {
            DecimalFormat df = new DecimalFormat("####.##");
		return "ID:" + idProducto + " - " + " Nombre:" + nombre+ " - " + " Precio del producto:" + df.format(precio)
				+ "";
	} 
}
