/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontienda.modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class Nodo {
    Producto dato;
    Nodo siguiente;
    
    public Nodo(Producto dato){
        this.dato=dato;
        this.siguiente= null;
    }

    public Producto getDato() {
        return dato;
    }

    public void setDato(Producto dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", siguiente=" + siguiente + '}';
    }
    
}
