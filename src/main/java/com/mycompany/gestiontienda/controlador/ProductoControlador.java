/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontienda.controlador;

import com.mycompany.gestiontienda.modelo.ListaEnlazada;
import com.mycompany.gestiontienda.modelo.Producto;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ESTUDIANTE
 */
public class ProductoControlador<T> {

    Scanner scanner = new Scanner(System.in);
    ListaEnlazada lista = new ListaEnlazada();
    Stack<String> pila = new Stack<>();
    int numero;

    public void AgregaProducto() {
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.next();

        System.out.println("Ingrese el precio del producto: ");
        Double precio = scanner.nextDouble();
        System.out.println("El codigo del Producto es: " + numero);
        System.out.println("Ingrese la cantidad del producto: ");
        int cantidad = scanner.nextInt();
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setCodigo(numero);
        producto.setPrecio(precio);
        producto.setCantidad(cantidad);
        lista.insertar(producto);
        numero++;
    }

    public void MostarInventario() {
        lista.imprimir();
    }

    public void Venta() {
        System.out.println("Ingrese el codigo del producto vendido ");
        int codigo = scanner.nextInt();
        lista.getElementoByIndide(codigo);
        
        System.out.println("Ingrese la cantidad del producto vendido: ");
        int cantidad = scanner.nextInt();
        Producto producto = lista.getElementoByIndide(codigo);
        lista.deleteByIndice(codigo, cantidad);
        pila.add("Producto vendido" + producto);
    }
    public void MostrarHistorial(){
        for (int i = 0; i < pila.size(); i++) {
            System.out.println(pila.get(i));
        }
        
    }
    public int Menu() {
        System.out.println("Ingrese la opcion que desea: ");
        System.out.println("1.- Crear Producto");
        System.out.println("2.- Vender Producto");
        System.out.println("3.- Mostrar Inventario");
        System.out.println("4.- Mostrar Historial");
        System.out.println("5.- Salir");

        int op1 = scanner.nextInt();
        scanner.nextLine();
        return op1;
    }

}
