/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontienda.modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class ListaEnlazada {
    Nodo cabeza;
    public ListaEnlazada(){
        this.cabeza=null;
    }
    
    //Metodo para insertar datos en nuestra lista
    public void insertar(Producto dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(cabeza==null){
        cabeza= nuevoNodo;
        }else{
            Nodo nodoActual = cabeza;
            while(nodoActual.siguiente !=null){
            nodoActual = nodoActual.siguiente;
            }
            nodoActual.siguiente = nuevoNodo;
        }
    }
    
    // Metodo para imprimir los elementos de la Lista
    public void imprimir(){
        Nodo nodoActual = cabeza;
        while(nodoActual != null){
            System.out.println(nodoActual.dato+"-");
            nodoActual = nodoActual.siguiente;
        }
        System.out.println();
    }
    
     public Producto getElementoByIndide(int indice){
        Nodo actual=cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }
     public void deleteByIndice(int indice,int cantidad){
      
            Nodo anterior = obtenerNodoByIndice(indice);
            String nombre = anterior.getDato().getNombre();
            double precio= anterior.getDato().getPrecio();
           int actual= anterior.getDato().getCantidad();
           int platurri= actual- cantidad;
           Producto producto = new Producto();
           producto.setCantidad(platurri);
           producto.setCodigo(indice);
           producto.setNombre(nombre);
           producto.setPrecio(precio);
           anterior.setDato(producto);
        }
        
    
     public Nodo obtenerNodoByIndice(int indice){
    Nodo actual=cabeza;
        for (int i = 0; i < indice; i++) {
        
            actual = actual.getSiguiente();
        }
        return actual;
    }
}
