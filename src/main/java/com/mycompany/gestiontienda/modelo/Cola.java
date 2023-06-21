/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontienda.modelo;

/**
 *
 * @author pablo
 */
import java.util.LinkedList;
import java.util.Queue;

public class Cola {
   public Cola(){
        Queue<String> cola = new LinkedList<>();

        // Agregar elementos a la cola
        cola.add("elemento1");
        cola.add("elemento2");
        cola.add("elemento3");

        // Obtener y eliminar el elemento frontal de la cola
        String elementoFrontal = cola.poll();
        System.out.println("Primer elemento de la cola y en salir es: " + elementoFrontal);

        System.out.println("Cola ----->"+ cola);
        // Obtener el elemento frontal sin eliminarlo
        String elementoFrontalActual = cola.peek();
        System.out.println("Elemento frontal actual: " + elementoFrontalActual);

        System.out.println("Cola ----->"+ cola);
        // Verificar si la cola está vacía
        boolean estaVacia = cola.isEmpty();
        System.out.println("¿La cola está vacía? " + estaVacia);
       System.out.println();
   }
}
