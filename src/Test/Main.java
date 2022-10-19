/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Dominio.Orden;
import Dominio.Producto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Main {
    //Metodo con el cual el usuario elige ver el orden de su compra o el precio a pagar
    public static int menu() {
        int opcion = 0;
        while (opcion <= 0 || opcion >= 4) {
            System.out.println("1. Mostrar orden de compra");
            System.out.println("2. Precio a pagar");
            System.out.println("3. Salir");
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
        }
        return opcion;
    }
    /*Metodo el cual el usuario introduce el nombre y el precio del producto. El usuario tiene 10 productos maximos 
    para comprar y si el usuario mete en el precio una letra o un precio inferior a 0, te repetira la pregunta*/ 
    public static void agregarCompra(Orden orden, ArrayList<Orden> contadorClientes) {
        String nombre = "";
        double precio = 0;
        int x = Orden.getMaxProductos();
        System.out.println("Bienvenido!!!");
        while (!nombre.equals("0") && x != 0) {
            System.out.println("Por favor, introduce el nombre del producto (0) para parar");
            Scanner teclado = new Scanner(System.in);
            String aux = "";
            x--;
            nombre = teclado.nextLine();
            if (!nombre.equals("0")) {
                do {
                    System.out.println("Introduce su precio  ");
                    if (teclado.hasNextFloat()) {
                        precio = teclado.nextFloat();
                    } else {
                        aux = teclado.next();
                    }
                } while (precio <= 0);
                orden.agregarUnProducto(new Producto(nombre, precio));
                contadorClientes.add(new Orden());
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Orden> contadorClientes = new ArrayList<>();
        Orden orden = new Orden();
        int eleccion;    
        agregarCompra(orden, contadorClientes);
        System.out.println("\t");
        System.out.println("¿Que desea hacer?");
        do {
            eleccion = menu();
            switch (eleccion) {
                case 1:
                    System.out.println("---------------------------------------");
                    System.out.println("\t");
                    System.out.println("Mostrando ticket");                   
                    orden.mostrarOrden(null);
                    System.out.println("---------------------------------------");
                    System.out.println("\t");
                    break;
                case 2:
                    System.out.println("\t");
                    orden.calcularTotal();
                    System.out.println("\t");
                    break;
                case 3:
                    System.out.println("Hasta la proxima");
                    break;
            }
        } while (eleccion != 3);
    }
}
