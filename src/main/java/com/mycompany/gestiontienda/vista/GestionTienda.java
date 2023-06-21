/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestiontienda.vista;

import com.mycompany.gestiontienda.controlador.ProductoControlador;

import java.util.Scanner;

/**
 *
 * @author paulc
 */
public class GestionTienda {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op1 = 0;
        
        ProductoControlador producto = new ProductoControlador();
      
        while (op1 != 5) {
            op1= producto.Menu();
            switch (op1) {
                case 1:
                    producto.AgregaProducto();
                   
                    break;
                case 2:
                    
                    producto.Venta();
                    break;
                case 3:
                    producto.MostarInventario();

                    break;
                case 4:
                    producto.MostrarHistorial();

            }

        }
    }
}
