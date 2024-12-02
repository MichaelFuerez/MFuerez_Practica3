/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import modelo.Producto;

/**
 *
 * @author HP
 */
public class Ejercicio4 {
   public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto("Manzana", (int) 1.50);
        Producto producto2 = new Producto("Plátano", (int) 0.75);

        // Imprimir toda la información de los productos
        System.out.println(producto1);
        System.out.println(producto2);
    }
}