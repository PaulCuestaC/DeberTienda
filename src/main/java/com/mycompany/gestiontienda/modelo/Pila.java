/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontienda.modelo;

/**
 *
 * @author pablo
 */
import java.util.Stack;

public class Pila<T> {
Stack<String> pila = new Stack<>();
  

    public void Historial(String elemento) {
        pila.push(elemento);
    }
    // Obtener y eliminar el elemento superior de la pila


}

