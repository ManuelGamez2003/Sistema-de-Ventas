/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public class Orden {
    /*Creamos el arraylist como atributo*/
    private int idOrden;
    private ArrayList<Producto> productos;
    static int contadorOrdenes;
    static final int MAX_PRODUCTOS = 10;
    //Creamos el constructor//
    public Orden() {
        contadorOrdenes++;
        this.idOrden = contadorOrdenes;
        ArrayList<Producto> productos1 = new ArrayList<>();
        this.productos = productos1;
    }
   //Metodo de agregar la informacion introducida al ArrayList
    public void agregarUnProducto(Producto producto) {
        this.productos.add(producto);
    }
    //Metodo de calcular el total a pagar
    public double calcularTotal() {
        DecimalFormat df = new DecimalFormat("####.##");
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total = total + this.productos.get(i).getPrecio();
        }
        System.out.println("El precio a pagar es " + df.format(total) + "€");
        return total;
    }
    //Metodo que muestra el orden de la compra, con su id, nombre y precio del producto
    public void mostrarOrden(ArrayList<Producto> arrayList) {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }
        System.out.println("\t");
        System.out.println("El numero de productos que se han comprado es " + (contadorOrdenes - 1));
    }

    public static int getContadorOrdenes() {
        return contadorOrdenes;
    }

    public static void setContador0rdenes(int contadorOrdenes) {
        Orden.contadorOrdenes = contadorOrdenes;
    }

    public static int getMaxProductos() {
        return MAX_PRODUCTOS;
    }

}
